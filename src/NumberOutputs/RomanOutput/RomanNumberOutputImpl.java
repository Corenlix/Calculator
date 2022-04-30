package NumberOutputs.RomanOutput;

import NumberOutputs.INumberOutput;

public class RomanNumberOutputImpl implements INumberOutput {
    private static final RomanValue[] romanValues = new RomanValue[]{
            new RomanValue("X", 10),
            new RomanValue("IX", 9),
            new RomanValue("V", 5),
            new RomanValue("IV", 4),
            new RomanValue("I", 1)};

    private int numberIntValue;
    private StringBuilder numberStringValue;

    @Override
    public String get(int number) {
        numberIntValue = number;
        numberStringValue = new StringBuilder();

        for (RomanValue romanValue : romanValues) {
            appendForValue(romanValue);
        }

        return numberStringValue.toString();
    }

    private void appendForValue(RomanValue romanValue) {
        while (numberIntValue >= romanValue.value) {
            numberIntValue -= romanValue.value;
            numberStringValue.append(romanValue.writing);
        }
    }
}
