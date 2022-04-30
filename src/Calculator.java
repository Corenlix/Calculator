public class Calculator {
    public static double calculateOperation(int a, int b, char operation) throws ArithmeticException{
        switch (operation){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return (double)a / b;
        }

        throw new ArithmeticException();
    }
}
