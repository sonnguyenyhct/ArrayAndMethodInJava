public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arrays = {13,2,3,42,4,24,24,2,312,1,2};
        int min = arrays[0];
        for (int i = 0; i < arrays.length-1;i++){
            if (min > arrays[i+1]){
                min = arrays[i+1];
            }
        }
        System.out.println(min);
    }
}
