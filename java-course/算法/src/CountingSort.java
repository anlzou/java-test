import java.util.Arrays;

public abstract class CountingSort implements IArraySort{
    public int[] sort(int[] sourceArray) throws Exception{
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        int maxValue = getMaxValue(arr);
        return countingSort(arr,maxValue);
    }

    private int[] countingSort(int[] arr,int maxValue){
        int bucketlen = maxValue+1;
        int[] bucket = new int[bucketlen];

        for(int value:arr){
            bucket[value]++;
        }

        int sortedIndex = 0;
        for (int j = 0; j < bucketlen; j++) {
            while (bucket[j] > 0){
                arr[sortedIndex++] = j;
                bucket[j]--;
            }
        }
        return arr;
    }

    private int getMaxValue(int[] arr){
        int maxValue = arr[0];
        for (int vaule:arr) {
            if(maxValue < vaule){
                maxValue = vaule;
            }
        }
        return maxValue;
    }
}
