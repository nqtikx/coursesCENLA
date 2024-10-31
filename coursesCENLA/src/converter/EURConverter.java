package converter;

/**
 * Класс для конвертации долларов США (USD) в евро (EUR).
 * Использует фиксированный курс обмена USD к EUR.
 */
public class EURConverter extends BaseCurrencyConverter {

    /**
     * Создает конвертер для перевода USD в EUR с использованием фиксированного курса.
     */
    public EURConverter() {
        super(USD_TO_EUR);
    }

}
