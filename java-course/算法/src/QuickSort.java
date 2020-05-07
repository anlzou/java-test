import java.util.Arrays;

public abstract class QuickSort implements IArraySort{
    public int[] sort(int[] sourceArray) throws Exception{
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        return quickSourt(arr,0,arr.length-1);
    }

    private int[] quickSourt(int[] arr,int left,int right){
        if(left < right){
            int partitionIndex = parition(arr,left,right);
            quickSourt(arr,left,partitionIndex-1);
            quickSourt(arr,partitionIndex+1,right);
        }
        return arr;
    }

    private int parition(int[] arr,int left,int rigth){
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= rigth; i++) {
            if(arr[i] < arr[pivot]){
                swap(arr,pivot,index);
                index++;
            }
        }
        swap(arr,pivot,index - 1);
        return index - 1;
    }

    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
