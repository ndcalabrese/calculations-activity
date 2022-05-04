import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {

        double[] numInput = getUserInput();

        double[] solutions = getCalculations(numInput);

        printSolutions(numInput, solutions);

    }

    public static double[] getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter another number: ");

        double num2 = Double.parseDouble(scanner.nextLine());

        return new double[]{num1, num2};

    }

    public static double[] getCalculations(double[] numbers) {

        double[] solutions = new double[5];

        // Addition
        solutions[0] = numbers[0] + numbers[1];
        // Subtraction
        solutions[1] = numbers[0] - numbers[1];
        // Multiplication
        solutions[2] = numbers[0] * numbers[1];
        // Division
        solutions[3] = numbers[0] / numbers[1];
        // Modulus
        solutions[4] = numbers[0] % numbers[1];

        return solutions;

    }

    public static void printSolutions(double[] numbers, double[] solutions) {

        System.out.println("\n" + numbers[0] + " + " + numbers[1] + " = " + solutions[0]);
        System.out.println(numbers[0] + " - " + numbers[1] + " = " + solutions[1]);
        System.out.println(numbers[0] + " * " + numbers[1] + " = " + solutions[2]);
        System.out.println(numbers[0] + " / " + numbers[1] + " = " + solutions[3]);
        System.out.println(numbers[0] + " % " + numbers[1] + " = " + solutions[4]);

    }

}
