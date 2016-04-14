package Tests;

import com.goit.gojavaonline.module5.ArraySort;
import com.goit.gojavaonline.module5.ElementSearch;
import com.sun.deploy.util.ArrayUtil;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ElementSearchTest {
    int[] unsortedArray1 = {1, 4, 3, 2, 5, -20, 805, 105};
    int[] unsortedArray2 = {1, 4, 3, 2, 5, -20, 805, 105};
    int[] sortedArray = {-20, 1, 2, 3, 4, 5, 105, 805};

    @Before
    public void setUp() throws Exception {
    }

    @Rule
    public Timeout timeout = Timeout.seconds(2L);

    @Test
    public void testArraySortMethod() throws Exception {
        Arrays.sort(unsortedArray1);
        ArraySort.arraySortMethod(unsortedArray2);
        assertArrayEquals(unsortedArray1, unsortedArray2);
        assertArrayEquals(sortedArray, unsortedArray2);

        System.out.println(Arrays.toString(unsortedArray1));
        System.out.println(Arrays.toString(unsortedArray2));
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    public void testMinimumElementSearch() throws Exception {
        ArraySort.arraySortMethod(unsortedArray1);
        int actual = ElementSearch.minimumElementSearch(unsortedArray1);
        int expected = Arrays.stream(unsortedArray1).min().getAsInt();

        assertEquals(expected, actual);
        System.out.println("min: actual " + actual + " = expected " + expected);
    }

    @Test
    public void testMaximumElementSearch() throws Exception {
        ArraySort.arraySortMethod(unsortedArray1);
        int actual = ElementSearch.maximumElementSearch(unsortedArray1);
        int expected = Arrays.stream(unsortedArray1).max().getAsInt();

        assertEquals(expected, actual);
        System.out.println("max: actual " + actual + " = expected " + expected);
    }
}
