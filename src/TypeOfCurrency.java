public class TypeOfCurrency {
    private String CurrencyCode;
    private double ExchangeRate;

    public String GetCurrencyCode() {
        return CurrencyCode;
    }

    public double GetExchangeRate() {
        return ExchangeRate;
    }

    public void SetExchangeRate(double rate) {
        this.ExchangeRate = rate;
    }

    public void SetCurrencyCode(String code) {
        this.CurrencyCode = code;
    }

    public TypeOfCurrency(String code, double rate) {
        SetExchangeRate(rate);
        SetCurrencyCode(code);
    }
}