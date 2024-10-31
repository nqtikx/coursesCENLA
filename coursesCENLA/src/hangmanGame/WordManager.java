package hangmanGame;

/**
 * Класс WordManager управляет процессом угадывания загаданного слова.
 * Содержит методы для обработки угадывания букв и проверки состояния слова.
 */
public class WordManager {
    private String wordToGuess;
    private char[] guessedWord;
    private int guessedLettersCount = 0;

    /**
     * Конструктор класса для инициализации полей класса
     *
     * @param wordToGuess - слово которое нужно отгадать
     */
    public WordManager(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord[i] = '_';
        }
    }

    /**
     * Метод для проверки вводимого символа с загаданным словом
     *
     * @param letter - вводимый символ
     * @return возрашает true - символ есть в данном слове, false в противном случае
     */
    public boolean guessedLetter(char letter) {
        boolean temp = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter && guessedWord[i] == '_') {
                temp = true;
                guessedWord[i] = wordToGuess.charAt(i);
                guessedLettersCount++;
            }
        }
        return temp;
    }

    /**
     * Метод для проверки слова
     *
     * @return возращает true, если слова разгадано, false - в противном случае
     */
    public boolean isWordGuessed() {
        return String.valueOf(guessedWord).equals(wordToGuess);
    }

    /**
     * Метод для вывода нынешнего состояния слова
     *
     * @return возращает строку нынешнего состояния слова
     */
    public String getGuessedWord() {
        return String.valueOf(guessedWord);
    }

    /**
     * Геттер счестичка найденных букв
     *
     * @return возращает количество найденных букв
     */
    public int getGuessedLettersCount() {
        return guessedLettersCount;
    }

    /**
     * Геттер для загаданного слова
     *
     * @return возращает загаданное слово
     */
    public String getWordToGuess() {
        return wordToGuess;
    }
}
