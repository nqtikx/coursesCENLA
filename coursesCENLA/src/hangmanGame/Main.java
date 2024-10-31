package hangmanGame;

/**
 * Основной класс для запуска игры "Виселица".
 */
public class Main {
    public static void main(String[] args) {
        int baseLives = 3;
        int coefficient = 3;
        WordList wordList = new WordList();
        int attempts = baseLives + wordList.getRandomWord().length() / coefficient;
        if (attempts >= 8) {
            attempts = 7;
        }
        HangmanGame hangmanGame = new HangmanGame(attempts, wordList.getRandomWord());
        hangmanGame.play();
    }
}
