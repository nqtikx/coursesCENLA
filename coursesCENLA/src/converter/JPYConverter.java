package converter;

/**
 * Класс для конвертации долларов США (USD) в японские иены (JPY).
 * Использует фиксированный курс обмена USD к JPY.
 */
public class JPYConverter extends BaseCurrencyConverter {

    /**
     * Создает конвертер для перевода USD в JPY с использованием фиксированного курса.
     */
    public JPYConverter() {
        super(USD_TO_JPY);
    }
}
