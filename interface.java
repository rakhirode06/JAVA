
interface IntUnaryOperator {
    int apply(int x);
}

public class FunctionPointerExample {
    
    public static int performOperation(int value, IntUnaryOperator operation) {
        return operation.apply(value);
    }

    public static void main(String[] args) {
        
        IntUnaryOperator doubleOperation = x -> x * 2;
        IntUnaryOperator squareOperation = x -> x * x;

        int value = 5;
        int result1 = performOperation(value, doubleOperation);
        int result2 = performOperation(value, squareOperation);

       
        System.out.println("Result of doubling " + value + ": " + result1);
        System.out.println("Result of squaring " + value + ": " + result2);
    }
}

