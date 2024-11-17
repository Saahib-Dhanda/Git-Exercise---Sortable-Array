package SortableArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortableArrayTest {


    @Test
public void testSortIntegers() {
    int [] test = {13,10,6,1};
    int [] result ={1,6,10,13};
    SortableArray.sortIntegers(test);
    assertArrayEquals(result, test, "The Array was not sorted correctly");

}

@Test
public void testSortStrings() {
    String [] test = {"Mia", "India", "Canada", "String"};
    String [] result = {"Canada", "India", "Mia", "String"};
    SortableArray.sortStrings(test);
    assertArrayEquals(result, test, "The Array was not sorted Correctly");
}



}
