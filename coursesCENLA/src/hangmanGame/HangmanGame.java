package hangmanGame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Класс HangmanGame представляет игру "Виселица", в которой игрок должен отгадать загаданное слово,
 * вводя буквы или пытаясь угадать всё слово целиком. Игрок теряет попытки за неправильные ответы,
 * и игра завершается победой при угадывании слова или поражением при исчерпании попыток.
 */
public class HangmanGame {
    private int attemptsLeft;
    private WordManager wordManager; // работа с загаданным словом
    private HangmanDrawer hangmanDrawer;
    private Set<Character> universalLetters;

    /**
     * Конструктор класса HangmanGame.
     *
     * @param attemptsLeft количество попыток, доступных игроку для угадывания слова
     * @param wordToGuess  слово, которое игрок должен угадать
     */
    public HangmanGame(int attemptsLeft, String wordToGuess) {
        this.attemptsLeft = attemptsLeft;
        this.wordManager = new WordManager(wordToGuess);
        this.hangmanDrawer = new HangmanDrawer();
        this.universalLetters = new HashSet<>();
    }

    /**
     * Возвращает текущее количество оставшихся попыток.
     *
     * @return количество оставшихся попыток
     */
    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    /**
     * Основной метод для запуска игры. Пользователю предлагается ввести букву или угадать всё слово.
     * Если пользователь вводит строку "i know word", он может попытаться угадать всё слово целиком.
     * Если слово или буква угаданы правильно, игрок продолжает игру. При неверном вводе количество попыток уменьшается.
     * Игра заканчивается либо победой (когда слово угадано), либо поражением (когда попытки заканчиваются).
     */
    public void play() {
        Scanner scan = new Scanner(System.in);

        while (attemptsLeft > 0 && !wordManager.isWordGuessed()) {
            System.out.println("Угадай слово: " + wordManager.getGuessedWord() + " (" + wordManager.getGuessedWord().length() + " букв)");
            System.out.println("Осталось попыток: " + attemptsLeft);
            System.out.println("Введи букву или строку \"i know word\", если хочешь угадать всё слово:");

            String input = scan.nextLine().toLowerCase();

            if (input.equals("i know word")) {
                System.out.println("Введите ваше слово для попытки:");
                String guessedWord = scan.nextLine().toLowerCase();

                if (guessedWord.equals(wordManager.getWordToGuess().toLowerCase())) {
                    System.out.println("Поздравляем! Вы угадали слово: " + wordManager.getWordToGuess());
                    break;
                } else {
                    System.out.println("Неверно! Вы проиграли.");
                    attemptsLeft = 0;
                }
            } else if (input.length() == 1) {
                char letter = input.charAt(0);

                if (universalLetters.contains(letter)) {
                    System.out.println("Вы уже вводили эту букву! Попробуйте другую.");
                    System.out.println("Введенные буквы: " + universalLetters + "\n");
                    continue;
                } else {
                    universalLetters.add(letter);
                }

                if (wordManager.guessedLetter(letter)) {
                    System.out.println("Верно!\n"/* Слово: " + wordManager.getGuessedWord()*/);
                } else {
                    attemptsLeft--;
                    System.out.println("Неверно! Осталось попыток: " + attemptsLeft);
                    hangmanDrawer.draw(attemptsLeft);
                }
            } else {
                System.out.println("Введите одну букву или команду \"i know word\".");
            }

            if (wordManager.isWordGuessed()) {
                System.out.println("Поздравляем! Вы угадали слово: " + wordManager.getWordToGuess());
                break;
            }

            if (attemptsLeft == 0) {
                System.out.println("У вас закончились попытки. Загаданное слово было: " + wordManager.getWordToGuess());
            }
        }

    }
}
