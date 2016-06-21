//冒泡排序：假如升序排列, 数组 5，4，7，9，3 → 4，5，7，9，3 → 4，5，7，9，3 →
//                      4，5，7，3，9 → 4，5，3，7，9 → 4，3，5，7，9 → 3，4，5，7，9
//升序排列：
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4,7,1,6,7,2,7,3,2,7,9};
        bubblesort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void bubblesort(int[] array){
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++ ) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
