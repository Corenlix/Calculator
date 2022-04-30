import java.util.HashMap;
import java.util.Map;

public class RomanNumberReader implements INumberReader {
    private final Map<Character, Integer> symbolsValues;
    private String stringValue;
    private int totalValue;
    private int lastSymbolValue;

    public RomanNumberReader(){
        symbolsValues = new HashMap<>();
        symbolsValues.put('I', 1);
        symbolsValues.put('V', 5);
        symbolsValues.put('X', 10);
    }

    @Override
    public int read(String number) throws ArithmeticException {
        totalValue = 0;
        lastSymbolValue = 0;
        stringValue = number;

        for(int i = stringValue.length() - 1; i >= 0; i--) {
            readSymbol(i);
        }

        return totalValue;
    }

    private void readSymbol(int position){
        char symbol = stringValue.charAt(position);
        if(!symbolsValues.containsKey(symbol))
            throw new ArithmeticException();
        int currentSymbolValue = symbolsValues.get(symbol);
        totalValue += currentSymbolValue < lastSymbolValue ? -currentSymbolValue : currentSymbolValue;
        lastSymbolValue = currentSymbolValue;
    }
}
