public class ExceptionHandlingExample {
    public static void main(String[] args) {
        
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; 
            System.out.println("Result of division: " + result); 
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 10; 
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}

