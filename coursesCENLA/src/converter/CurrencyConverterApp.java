package converter;

import java.util.Scanner;

/**
 * Основное приложение для конвертации валют.
 * Запрашивает у пользователя сумму в долларах США (USD) и
 * выводит эквиваленты этой суммы в других валютах:
 * евро (EUR), российские рубли (RUB), японские иены (JPY),
 * фунты стерлингов (GBP) и белорусские рубли (BYN).
 */
public class CurrencyConverterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму в долларах США (USD) для конвертации:");
        double amountInUSD = scanner.nextDouble();

        CurrencyConverterInterface eurConverter = new EURConverter();
        CurrencyConverterInterface rubConverter = new RUBConverter();
        CurrencyConverterInterface jpyConverter = new JPYConverter();
        CurrencyConverterInterface gbpConverter = new GBPConverter();
        CurrencyConverterInterface bynConverter = new BYNConverter();

        System.out.printf("Сумма в Евро (EUR): %.2f\n", eurConverter.convertTo(amountInUSD));
        System.out.printf("Сумма в Российских рублях (RUB): %.2f\n", rubConverter.convertTo(amountInUSD));
        System.out.printf("Сумма в Японских иенах (JPY): %.2f\n", jpyConverter.convertTo(amountInUSD));
        System.out.printf("Сумма в Фунтах стерлингов (GBP): %.2f\n", gbpConverter.convertTo(amountInUSD));
        System.out.printf("Сумма в Белорусских рублях (BYN): %.2f\n", bynConverter.convertTo(amountInUSD));

    }
}
