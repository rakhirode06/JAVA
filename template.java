public class MyGenericFunction {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("Character Array:");
        printArray(charArray);
    }
}

