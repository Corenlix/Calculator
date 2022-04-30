import java.util.Scanner;

public class Program {
    static Scanner scanner;

    public static void main(String [] args){
        scanner = new Scanner(System.in);
        readCalculationInput();
    }

    private static void readCalculationInput(){
        String input = scanner.nextLine();
        double result = CalculationParser.Calculate(input);
        System.out.println(result);
    }
}

