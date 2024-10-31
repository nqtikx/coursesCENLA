package passwordGenerator;

import java.util.Random;

/**
 * Класс для генерации безопасных паролей с возможностью выбора длины.
 * Пароль содержит заглавные и строчные буквы, цифры и специальные символы.
 */
public class PasswordGeneration {
    private static final Random random = new Random();

    /**
     * Генерирует случайный пароль заданной длины.
     *
     * @param length длина пароля (от 8 до 12 символов).
     * @return сгенерированный пароль.
     * @throws IllegalArgumentException если длина не в пределах от 8 до 12.
     */
    public String generatePassword(int length) {

        StringBuilder password = new StringBuilder(length);
        password.append(getRandomUppercaseLetter());
        password.append(getRandomLowercaseLetter());
        password.append(getRandomNumber());
        password.append(getRandomSpecialCharacter());

        for (int i = 4; i < length; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    password.append(getRandomUppercaseLetter());
                    break;
                case 1:
                    password.append(getRandomLowercaseLetter());
                    break;
                case 2:
                    password.append(getRandomNumber());
                    break;
                case 3:
                    password.append(getRandomSpecialCharacter());
                    break;
            }
        }
        return shufflePassword(password.toString());
    }

    /**
     * Перемешивает символы в заданном пароле для увеличения случайности.
     *
     * @param password строка пароля, символы которой необходимо перемешать
     * @return новый пароль, в котором символы перемешаны случайным образом
     */
    private String shufflePassword(String password) {
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    private static char getRandomUppercaseLetter() {
        return (char) (random.nextInt(26) + 65);
    }

    private static char getRandomLowercaseLetter() {
        return (char) (random.nextInt(26) + 97);
    }

    private static char getRandomNumber() {
        return (char) (random.nextInt(10) + 48);
    }

    private static char getRandomSpecialCharacter() {
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+'};
        return specialChars[random.nextInt(specialChars.length)];
    }
}
