import Parser.CalculationParser;

import java.util.Scanner;

public class Program {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        readCalculationInput();
    }

    private static void readCalculationInput() {
        String input = scanner.nextLine();
        String result = CalculationParser.calculate(input);
        System.out.println(result);
    }
}

