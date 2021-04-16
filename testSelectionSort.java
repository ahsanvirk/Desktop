package Lab10CIS285;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
    }

    public void testPositive(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort temp1 = new SelectionSort();

        /** add tests to check for this unit test **/
       arr = temp1.basicSelectionSort(arr);
       assertArrayEquals(Sortedarr, arr);

    }

    public void testNegative(){
        /** Test data contains negative values only **/
    	int[] arr = new int[5];
    	arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -7;
        Sortedarr[2] = -8;
        Sortedarr[3] = -9;
        Sortedarr[4] = -10;

        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
       assertArrayEquals(Sortedarr, arr);

    }

    public void testMixed(){
        /** Test data contains with both positive, negative and zeros **/
    	int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = -7;
        arr[4] = 0;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 3;
        Sortedarr[4] = 4;

        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);

    }

    public void testDuplicates(){
        /** Test data contains duplicates **/
    	int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = 94;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 2;
        Sortedarr[2] = 7;
        Sortedarr[3] = 10;
        Sortedarr[4] = 94;

        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
       assertArrayEquals(Sortedarr, arr);

    }


}
