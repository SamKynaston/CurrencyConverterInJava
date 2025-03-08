import java.util.ArrayList;
import java.util.Currency;
import java.util.Objects;

public class CurrencyTable {
    private ArrayList<Currency> CurrencyList = new ArrayList<>();

    public void AddCurrency(Currency currency) {
        CurrencyList.add(currency);
    }

    public void RemoveCurrency(Currency currency) {
        CurrencyList.remove(currency);
    }

    public Currency GetCurrencyFromCode(String Code) {
        for (Currency Currency : CurrencyList) {
            if (!Objects.equals(Currency.getCurrencyCode(), Code)) { continue; }

            return Currency;
        }

        return null;
    }
}
