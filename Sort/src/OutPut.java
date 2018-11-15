public class OutPut {

    public static int[] getArray() {
        int[] array = {3,8,2,5,1,6,9,4,7};
        return array;
    }

    public static void myprint(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

 /**===============复写*/

    public static void main(String[] args) {
        int[] array = getArray();
        OutPut.myprint(array);
    }
}
