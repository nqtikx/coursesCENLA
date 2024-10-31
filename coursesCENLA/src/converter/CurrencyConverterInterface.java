package converter;

/**
 * Интерфейс для конвертации валют.
 * Определяет метод для конвертации суммы из одной валюты в другую.
 */
public interface CurrencyConverterInterface {

    /**
     * Конвертирует заданную сумму в целевую валюту.
     *
     * @param amount сумма в исходной валюте
     * @return эквивалентная сумма в целевой валюте
     */
    double convertTo(double amount);
}
