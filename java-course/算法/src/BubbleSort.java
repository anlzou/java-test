import java.util.Arrays;

public abstract class BubbleSort implements IArraySort{
    @Override
    public int[] sort(int[] sourceArray) throws Exception {
        int arr[] = Arrays.copyOf(sourceArray,sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
        return arr;
    }
}
