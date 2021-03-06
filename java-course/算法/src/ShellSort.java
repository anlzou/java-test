import java.util.Arrays;

public abstract class ShellSort implements IArraySort{
    @Override
    public int[] sort(int [] sourceArray) throws Exception{
        int arr[] = Arrays.copyOf(sourceArray,sourceArray.length);
        int gap = 1;
        while (gap < arr.length){
            gap = gap * 3 + 1;
        }
        while (gap > 0){
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > temp){
                    arr[j+gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = temp;
            }
            gap = (int)Math.floor(gap/3);
        }
        return arr;
    }
}
