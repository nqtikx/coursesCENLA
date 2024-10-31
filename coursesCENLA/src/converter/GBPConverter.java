package converter;

/**
 * Класс для конвертации долларов США (USD) в британские фунты стерлингов (GBP).
 * Использует фиксированный курс обмена USD к GBP.
 */
public class GBPConverter extends BaseCurrencyConverter {

    /**
     * Создает конвертер для перевода USD в GBP с использованием фиксированного курса.
     */
    public GBPConverter() {
        super(USD_TO_GBP);
    }
}
