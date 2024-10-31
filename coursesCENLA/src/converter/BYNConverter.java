package converter;

/**
 * Класс для конвертации долларов США (USD) в белорусские рубли (BYN).
 * Использует фиксированный курс обмена USD к BYN.
 */
public class BYNConverter extends BaseCurrencyConverter {

    /**
     * Создает конвертер для перевода USD в BYN с использованием фиксированного курса.
     */
    public BYNConverter() {
        super(USD_TO_BYN);
    }
}
