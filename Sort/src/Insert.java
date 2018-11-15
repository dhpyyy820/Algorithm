/**
 * 插入排序
 * 最佳：O(n)
 * 最差：O(n^2)
 * 平均：O(n^2)
 */
public class Insert {

    public static int[] insert(int[] arr) {
        int insertIndex;
        int current;
        for (int i=0; i<arr.length-1; i++) {
            current = arr[i+1];
            insertIndex = i;
            while (insertIndex >=0 && arr[insertIndex] > current) {
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = OutPut.getArray();
        insert(array);
        OutPut.myprint(array);
    }
}
