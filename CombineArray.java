public class CombineArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array1 = {6,7,8,9,10};
        int[] arrayTotal = new int[array.length + array1.length];

        for (int i = 0; i < array.length; i++){
            arrayTotal[i] = array[i];
        }
        for (int i = 0; i < array1.length; i++){
            arrayTotal[i + array.length] = array1[i];
        }
        for (int i = 0; i < arrayTotal.length; i++){
            System.out.print(arrayTotal[i] + " , ");
        }

    }
}
