package NumberOutputs.RomanOutput;

import NumberOutputs.INumberOutput;

public class RomanNumberOutputImpl implements INumberOutput {
    private static final RomanValue[] romanValues = new RomanValue[]{
            new RomanValue("M", 1000),
            new RomanValue("CM", 900),
            new RomanValue("D", 500),
            new RomanValue("CD", 400),
            new RomanValue("C", 100),
            new RomanValue("XC", 90),
            new RomanValue("L", 50),
            new RomanValue("XL", 40),
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
