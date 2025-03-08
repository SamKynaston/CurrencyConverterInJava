import java.util.ArrayList;
import java.util.Objects;

public class CurrencyTable {
    private final ArrayList<TypeOfCurrency> CurrencyList = new ArrayList<>();

    public void AddCurrency(TypeOfCurrency currency) {
        CurrencyList.add(currency);
    }

    public void RemoveCurrency(TypeOfCurrency currency) {
        CurrencyList.remove(currency);
    }

    public ArrayList<TypeOfCurrency> GetAllCurrencies() {
        return CurrencyList;
    }

    public TypeOfCurrency GetCurrencyFromCode(String Code) {
        for (TypeOfCurrency Currency : CurrencyList) {
            if (!Objects.equals(Currency.GetCurrencyCode(), Code)) { continue; }

            return Currency;
        }

        return null;
    }
}
