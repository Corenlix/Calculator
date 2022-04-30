package Calculator;

public class Calculator {
    public static int calculateOperation(int a, int b, char operation) throws ArithmeticException {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }

        throw new ArithmeticException();
    }
}
