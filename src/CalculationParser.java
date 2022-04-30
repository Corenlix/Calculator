public class CalculationParser {
    public static double Calculate(String expression) throws ArithmeticException{
        INumberReader numberReader = Character.isDigit(expression.charAt(0)) ? new ArabicNumberReader() : new RomanNumberReader();
        String[] elements = expression.split(" ");
        if(elements.length != 3 || elements[1].length() != 1)
            throw new ArithmeticException();

        return Calculator.calculateOperation(numberReader.read(elements[0]), numberReader.read(elements[2]), elements[1].charAt(0));
    }
}
