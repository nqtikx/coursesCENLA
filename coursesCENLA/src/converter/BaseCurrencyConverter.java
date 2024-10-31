package converter;

/**
 * Абстрактный класс для конвертации валют с фиксированными курсами обмена.
 */
public abstract class BaseCurrencyConverter implements CurrencyConverterInterface {

    /** Курс доллара к евро */
    protected static final double USD_TO_EUR = 0.92;

    /** Курс доллара к рублю */
    protected static final double USD_TO_RUB = 97.23;

    /** Курс доллара к японской иене */
    protected static final double USD_TO_JPY = 153.4;

    /** Курс доллара к британскому фунту */
    protected static final double USD_TO_GBP = 0.77;

    /** Курс доллара к белорусскому рублю */
    protected static final double USD_TO_BYN = 3.31;

    /** Курс обмена для конкретного объекта конвертера */
    protected double rate;

    /**
     * Создает конвертер с указанным курсом.
     *
     * @param rate курс обмена для данной валюты
     */
    public BaseCurrencyConverter(double rate) {
        this.rate = rate;
    }

    /**
     * Возвращает текущий курс обмена.
     *
     * @return курс обмена
     */
    public double getRate() {
        return this.rate;
    }

    /**
     * Конвертирует заданную сумму по установленному курсу.
     *
     * @param amount сумма в USD
     * @return сумма в целевой валюте
     */
    @Override
    public double convertTo(double amount) {
        return amount * rate;
    }
}
