import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSelectionSort {

    @Test
    public void testFunSelectionSortArray(){
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {3,2,4,1};
        int[] sortArr = {1,2,3,4};
        assertArrayEquals(  sortArr, selectionSort.selectionSortArray(selectionSort.selectionSortArray(arr)) );
    }


    @Test
    public void testFunSelectionSortArray2(){
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {52,3,2};
        int[] sortArr = {2,3,52};
        assertArrayEquals(  sortArr, selectionSort.selectionSortArray(selectionSort.selectionSortArray(arr)) );
    }


    @Test
    public void testFunSelectionSortArray3(){
        SelectionSort selectionSort = new SelectionSort();
        int[] arr =  {4,12,4,78,7,-1};
        int[] sortArr = {-1,4,4,7,12,78};
        assertArrayEquals(  sortArr, selectionSort.selectionSortArray(selectionSort.selectionSortArray(arr)) );
    }
}
