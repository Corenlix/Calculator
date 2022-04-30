package NumberReaders.RomanReader;

import NumberReaders.INumberReader;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberReaderImpl implements INumberReader {
    private static final Map<Character, Integer> symbolsValues = new HashMap<>(Map.of('I', 1, 'V', 5, 'X', 10));
    private String stringValue;
    private int totalValue;
    private int lastSymbolValue;

    @Override
    public int read(String number) throws ArithmeticException {
        totalValue = 0;
        lastSymbolValue = 0;
        stringValue = number;

        for (int i = stringValue.length() - 1; i >= 0; i--) {
            readSymbol(i);
        }

        return totalValue;
    }

    private void readSymbol(int position) {
        char symbol = stringValue.charAt(position);
        if (!symbolsValues.containsKey(symbol)) {
            throw new ArithmeticException();
        }
        int currentSymbolValue = symbolsValues.get(symbol);
        totalValue += currentSymbolValue < lastSymbolValue ? -currentSymbolValue : currentSymbolValue;
        lastSymbolValue = currentSymbolValue;
    }
}
