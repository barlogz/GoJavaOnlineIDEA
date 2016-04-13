package Tests;

import com.goit.gojavaonline.module5.ArraySort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ElementSearchTest {
    int[] unsortedArray1 = {1, 4, 3, 2, 5, -20, 805, 105};
    int[] unsortedArray2 = {1, 4, 3, 2, 5, -20, 805, 105};
    int[] sortedArray = {-20, 1, 2, 3, 4, 5, 105, 805};

    @Before
    public void setUp() throws Exception {
    }

    @Test(timeout = 1000)
    public void testMain() throws Exception {
        Arrays.sort(unsortedArray1);
        ArraySort.arraySortMethod(unsortedArray2);
        assertArrayEquals(unsortedArray1, unsortedArray2);
        assertArrayEquals(sortedArray, unsortedArray2);

        System.out.println(Arrays.toString(unsortedArray1));
        System.out.println(Arrays.toString(unsortedArray2));
        System.out.println(Arrays.toString(sortedArray));

    }
}
