package hangmanGame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Класс WordList отвечает за управление списком слов и выбор случайного слова для игры "Виселица".
 */
public class WordList {
    private ArrayList<String> words;
    private String randomWord;

    /**
     * Конструктор класса, для инициалазации ArrayList
     */
    public WordList() {
        this.words = new ArrayList<>();
        initializeWords();
    }

    /**
     * Метод для заполнения ArrayList словами
     */
    private void initializeWords() {
        words.add("example");
        words.add("programming");
        words.add("java");
        words.add("hangman");
        words.add("computer");
        words.add("science");
        words.add("challenge");
        words.add("leetcode");
        words.add("keyboard");
        words.add("internet");
        words.add("software");
        words.add("hardware");
        words.add("algorithm");
        words.add("developer");
        words.add("variable");
        words.add("function");
        words.add("object");
        words.add("interface");
        words.add("inheritance");
        words.add("polymorphism");
        words.add("encapsulation");
        words.add("abstraction");
        words.add("constructor");
        words.add("exception");
        words.add("iteration");
        words.add("recursion");
        words.add("framework");
        words.add("database");
        words.add("compilation");
        words.add("syntax");
    }


    /**
     * Метод для получения случайной строки
     *
     * @return - возращает случайную строку
     */
    public String getRandomWord() {
        if (randomWord == null) { // Проверяем, было ли уже выбрано слово
            Random random = new Random();
            int index = random.nextInt(words.size());
            randomWord = words.get(index); // Сохраняем выбранное слово
        }
        return randomWord;
    }
}
