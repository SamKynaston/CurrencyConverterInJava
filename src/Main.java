public class Main {
    public static void main(String[] args) {
        CurrencyTable currencies = new CurrencyTable();

        // Create five currency objects
        currencies.AddCurrency(new TypeOfCurrency("USD", 1));
        currencies.AddCurrency(new TypeOfCurrency("GBP", 1.15));
        currencies.AddCurrency(new TypeOfCurrency("EUR", 0.9));
        currencies.AddCurrency(new TypeOfCurrency("YEN", 0.01));
        currencies.AddCurrency(new TypeOfCurrency("ZLT", 3));
    }
}
