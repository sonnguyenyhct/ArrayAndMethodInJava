public class FindMinValue {
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++){
            if (min > arr[i+1]){
                min = arr[i+1];
            }
        }
        return min;
    }
}
