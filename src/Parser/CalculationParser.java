package Parser;

import Calculator.Calculator;
import NumberOutputs.ArabicOutput.ArabicOutputImpl;
import NumberOutputs.INumberOutput;
import NumberOutputs.RomanOutput.RomanNumberOutputImpl;
import NumberReaders.ArabicReader.ArabicNumberReaderImpl;
import NumberReaders.INumberReader;
import NumberReaders.RomanReader.RomanNumberReaderImpl;

public class CalculationParser {
    public static String calculate(String expression) throws ArithmeticException {
        boolean numbersArabic = Character.isDigit(expression.charAt(0));
        INumberReader numberReader = numbersArabic ? new ArabicNumberReaderImpl() : new RomanNumberReaderImpl();
        INumberOutput numberOutput = numbersArabic ? new ArabicOutputImpl() : new RomanNumberOutputImpl();

        int result = getCalculationResult(expression, numberReader);
        return numberOutput.get(result);
    }

    private static int getCalculationResult(String expression, INumberReader numberReader) throws ArithmeticException {
        String[] elements = expression.split(" ");
        if (elements.length != 3 || elements[1].length() != 1)
            throw new ArithmeticException();

        return Calculator.calculateOperation(numberReader.read(elements[0]), numberReader.read(elements[2]), elements[1].charAt(0));
    }
}
