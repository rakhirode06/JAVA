public class ElementIndexFinder {
    public static void main(String[] args) {
      
        int[] array = {10, 20, 30, 40, 50, 20, 60};

        
        int elementToFind2 = 60;
        
        
        System.out.println("Index of " + elementToFind1 + ": " + findElementIndex(array, elementToFind1));

        System.out.println("Index of " + elementToFind2 + ": " + findElementIndex(array, elementToFind2));
    }

    public static int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
}

