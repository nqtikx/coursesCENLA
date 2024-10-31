package converter;

/**
 * Класс для конвертации долларов США (USD) в российские рубли (RUB).
 * Использует фиксированный курс обмена USD к RUB.
 */
public class RUBConverter extends BaseCurrencyConverter {

    /**
     * Создает конвертер для перевода USD в RUB с использованием фиксированного курса.
     */
    public RUBConverter() {
        super(USD_TO_RUB);
    }
}
