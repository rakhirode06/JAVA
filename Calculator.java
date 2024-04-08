public class Calculator {

    public static void main(String[] args) {
        int operand1 = 10;  
        int operand2 = 5;   
        char operator = '+'; 

        try {
            int result = calculate(operand1, operand2, operator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int calculate(int operand1, int operand2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        return result;
    }
}

