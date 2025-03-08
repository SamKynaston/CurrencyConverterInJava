import java.util.Currency;
import java.util.Scanner;

public class Main {
    private static final Scanner reader = new Scanner(System.in);
    private static final CurrencyTable currencies = new CurrencyTable();

    public static void CurrencyConversionMenu() {
        boolean isClosed = false;
        boolean hasDecided = false;

        while (!isClosed) {
            System.out.println("Type in an amount ");
            int AmountToConvert = reader.nextInt();

            for (int x = 1; x < currencies.GetAllCurrencies().size(); x++) {
                System.out.println(x + ". " + currencies.GetAllCurrencies().get(x).GetCurrencyCode());
            }

            System.out.println("Select a Currency: ");
            int Currency1 = reader.nextInt();

            for (int x = 1; x < currencies.GetAllCurrencies().size(); x++) {
                if (x == Currency1) {continue;}
                System.out.println(x + ". " + currencies.GetAllCurrencies().get(x).GetCurrencyCode());
            }

            int Currency2 = 0;

            while (!hasDecided) {
                System.out.println("Select a Currency: ");
                Currency2 = reader.nextInt();

                if (Currency2 != Currency1) { hasDecided = true; }
            }

            TypeOfCurrency CurrencyObject1 = currencies.GetAllCurrencies().get(Currency1);
            TypeOfCurrency CurrencyObject2 = currencies.GetAllCurrencies().get(Currency2);

            double ConvertedAmount = AmountToConvert * (CurrencyObject1.GetExchangeRate() / CurrencyObject2.GetExchangeRate());

            System.out.println("Your amount is: " + ConvertedAmount);

            isClosed = true;
        }
    }

    public static void main(String[] args) {
        // Create five currency objects
        currencies.AddCurrency(new TypeOfCurrency("USD", 1));
        currencies.AddCurrency(new TypeOfCurrency("GBP", 1.15));
        currencies.AddCurrency(new TypeOfCurrency("EUR", 0.9));
        currencies.AddCurrency(new TypeOfCurrency("YEN", 0.01));
        currencies.AddCurrency(new TypeOfCurrency("ZLT", 3));

        CurrencyConversionMenu();
    }
}
