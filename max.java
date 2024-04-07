public class MaxMinArray {
    public static void main(String[] args) {
        
        int[] array = {10, 20, 30, 5, 15};

        
        int max = findMax(array);
        int min = findMin(array);

       
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
    }

    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

