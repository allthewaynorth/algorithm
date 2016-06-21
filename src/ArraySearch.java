//二分查找(binary search)(折半查找): 待查找数组要有序，无论升序降序
//需要注意的是计算中间位置时不应该使用(high+ low) / 2的方式，因为加法运算可能导致整数越界
//这里应该使用以下三种方式之一：low + (high - low) / 2
//或low + (high – low) >> 1
//或(low + high) >>> 1（>>>是逻辑右移，是不带符号位的右移）
public class ArraySearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int b = 2;
        int result = binarySearch(a, b);
        System.out.println(result);
    }

    static int binarySearch(int[] array, int value){
        int low = 0;
        int high = array.length - 1;
        int middle;

        while(low <= high){
            middle = (low + high) >>> 1;
            if(array[middle] == value){
                return middle;
            }
            if(value < array[middle]){
                high = middle - 1;
            }
            if(value > array[middle]){
                low = middle + 1;
            }
        }
        return -1;
    }
}