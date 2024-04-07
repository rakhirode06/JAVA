import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Error! Division by zero.");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        char choice;

        do {
            System.out.print("Enter value of a: ");
            a = scanner.nextDouble();
            System.out.print("Enter value of b: ");
            b = scanner.nextDouble();

            Calculator calc = new Calculator(a, b);

            System.out.println("Choose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            double result;
            switch (choice) {
                case '1':
                    result = calc.add();
                    System.out.println("Result: " + result);
                    break;
                case '2':
                    result = calc.subtract();
                    System.out.println("Result: " + result);
                    break;
                case '3':
                    result = calc.multiply();
                    System.out.println("Result: " + result);
                    break;
                case '4':
                    result = calc.divide();
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to perform another operation? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Calculator is closed.");
        scanner.close();
    }
}
