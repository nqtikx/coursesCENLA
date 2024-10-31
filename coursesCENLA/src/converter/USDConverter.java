package converter;

/**
 * Класс для конвертации долларов США (USD) в доллары США (USD).
 * Использует фиксированный курс обмена равный 1.0, так как
 * сумма в долларах остается неизменной.
 */
public class USDConverter extends BaseCurrencyConverter {

    /**
     * Создает конвертер для перевода USD в USD с использованием фиксированного курса равного 1.0.
     */
    public USDConverter() {
        super(1.0);
    }
}
