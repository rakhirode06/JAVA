import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        
        int[] array = {1, 3, 4, 6, 7, 8, 10};

        
        Arrays.sort(array);

    
        int missingInteger = findMissingInteger(array);

       
        System.out.println("The missing integer in the array is: " + missingInteger);
    }

    public static int findMissingInteger(int[] arr) {
        int n = arr.length;
        int expected = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != expected) {
                return expected;
            }
            expected++;
        }

        return expected; 
}

