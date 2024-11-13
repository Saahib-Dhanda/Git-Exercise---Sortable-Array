package SortableArray;
import java.util.Arrays;

public class SortableArray {
    public static void sortIntegers(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1};
        sortIntegers(numbers);
        System.out.println("Sorted integers: " + Arrays.toString(numbers));
    }
}
