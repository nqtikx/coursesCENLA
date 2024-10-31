package passwordGenerator;

import java.util.Scanner;

/**
 * Главный класс для запуска программы генерации пароля.
 */
public class PasswordApp {
    /**
     * Основной метод программы для запуска генерации пароля.
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordGeneration generator = new PasswordGeneration();
        int length;
        System.out.println("Введите желаемую длину пароля (от 8 до 12): ");
        while (true) {
            length = scanner.nextInt();
            if (length > 12 || length < 8) {
                System.out.println("Ошибка ввода, введите число от 8 до 12!");
                continue;
            } else {
                break;
            }
        }
        String password = generator.generatePassword(length);
        System.out.println("Сгенерированный пароль: " + password);
    }
}
