/**
 * 选择排序
 * 最佳：O(n^2)
 * 最差：O(n^2)
 * 平均：O(n^2)
 */
public class Select {

    public static void select(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            int min = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[j] < array[min]) {
                    int temp = array[j];
                    array[j] = array[min];
                    array[min] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = OutPut.getArray();
        select(array);
        OutPut.myprint(array);
    }
}
