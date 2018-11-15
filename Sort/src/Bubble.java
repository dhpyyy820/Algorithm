/**
 * 冒泡排序
 * 最佳：O(n)
 * 最差：O(n^2)
 * 平均：O(n^2)
 */
public class Bubble {

    public static int[] bubble(int[] array) {
        boolean flag = true;
        for (int i=0; i<array.length-2; i++) {
            for (int j=0; j<array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    flag = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(flag) {
                return array;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = OutPut.getArray();
        bubble(array);
        OutPut.myprint(array);
    }
}
