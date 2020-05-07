import java.util.Arrays;

public abstract class BucketSort implements IArraySort{
    private final InsertSort inserSort = new InsertSort();
        @Override
        public int[] sort(int[] scourseSort) throws Exception {
            int[] arr = Arrays.copyOf(scourseSort,scourseSort.length);
            return bucketSort(arr,5);
        }

        private int[] bucketSort(int[] arr,int bucketSize) throws Exception{
            if(arr.length == 0){
                return arr;
            }

            int minValue = arr[0];
            int maxValue = arr[0];
            for(int value:arr){
                if(value < minValue){
                    maxValue = value;
                }else if (value < maxValue){
                    maxValue = value;
                }
            }
            int bucketCount = (int)Math.floor((maxValue - minValue) / bucketSize)+1;
            int[][] buckets = new int[bucketCount][0];
            for (int i = 0; i < arr.length; i++) {
                int index = (int)Math.floor((arr[i] - minValue) / bucketSize);
                buckets[index] = arrAppend(buckets[index],arr[i]);
            }

            int arrIndex = 0;
            for(int[] bucket:buckets){
                if(bucket.length <= 0){
                    continue;
                }
                bucket = inserSort.sort(bucket);
                for(int value:bucket){
                    arr[arrIndex++] = value;
                }
            }
            return arr;
        }

    private int[] arrAppend(int[] arr,int value){
        arr = Arrays.copyOf(arr,arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }
}
