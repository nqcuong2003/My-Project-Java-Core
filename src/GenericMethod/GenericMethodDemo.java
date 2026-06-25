package GenericMethod;

public class GenericMethodDemo {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"Java", "Python", "C++"};
        Double[] doubleArray = {1.1,2.2,3.3};

        System.out.println("mang so nguyen: ");
        printArray(intArray);

        System.out.println("mang chuoi: "+stringArray);
        printArray(stringArray);

        System.out.println("mang so thuc: "+doubleArray);
        printArray(doubleArray);
    }
}
