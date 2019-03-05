public class SelectionSort {


    public int[] selectionSortArray(int[] arr){

        for( int i=0; i<arr.length; i++ ){
            for( int j=arr.length-1; j>0; j-- ){
                if( arr[j-1] > arr[j] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

}
