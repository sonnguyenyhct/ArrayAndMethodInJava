import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int element;
        int[] array = {1,2,3,4,5,3,6,7,7,7,8,9,7};
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can xoa");
        element = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            if (element == array[i]){
                for (int j = i;j < array.length-1; j++){
                    array[j] = array[j+1];
                }
                array[array.length - 1] = 0;
                check = true;
                i--;
            }
        }
        if (check){
            for (int j : array) {
                System.out.print(j + ",");
            }
        }else {
            System.out.println("Khong tim thay");
        }

    }
}
