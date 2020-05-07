import java.util.Arrays;

public class InsertSort implements IArraySort{
    public int[] sort(int[] scourseSort) throws Exception{
        int[] arr = Arrays.copyOf(scourseSort,scourseSort.length);
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && temp<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            if(j != i){
                arr[i] = temp;
            }
        }
        return arr;
    }
}
