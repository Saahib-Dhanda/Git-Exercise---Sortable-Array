package SortableArray;
import java.util.Arrays;

public class SortableArray {
    public static void sortIntegers(int[] array) {
        Arrays.sort(array);
    }

    public static void sortStrings(String[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] numbers = {13, 10, 6, 1};
        sortIntegers(numbers);
        System.out.println("Sorted integers: " + Arrays.toString(numbers));
        
        System.out.println("\n");

        String [] words = {"Mia", "India", "Canada", "String"};
        sortStrings(words);
        System.out.println("Sorted Words : " + Arrays.toString(words));




    }
}
