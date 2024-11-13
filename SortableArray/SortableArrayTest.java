package SortableArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortableArrayTest {


    @Test
public void testSortIntegers() {
    int [] test = {5,3,8,1};
    int [] result ={1,3,5,8};
    SortableArray.sortIntegers(test);
    assertArrayEquals(result, test, "The Array was not sorted correctly");

    
}


    
}
