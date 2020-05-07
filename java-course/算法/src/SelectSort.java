import java.util.Arrays;

public abstract class SelectSort implements IArraySort{
    public int[] sort(int[] sourceArray) throws Exception{
        int arr[] = Arrays.copyOf(sourceArray,sourceArray.length);
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
}
