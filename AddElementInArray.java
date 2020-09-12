import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int element;
        int index;
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array1 = new int[array.length+1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can them");
        element = scanner.nextInt();
        System.out.println("Vi tri can chen");
        index = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            array1[i] = array[i];
                if (i == index-1){
                    for (int j = i; j < array.length; j++){
                        array1[j+1] = array[j];
                    }
                    array1[i] = element;
                    break;
                }
            }
            for (int j : array1) {
                System.out.print(j + ",");
        }
    }
}
