import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr;
        int a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong mang < 20");
            a = scanner.nextInt();
            if (a > 20){
                System.out.println("Nhap lai");
            }
        }while (a > 20);
        arr = new int[a];
        for (int i = 0; i < a; i++){
            System.out.println("Nhap phan tu thu " + (i+1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < a/2; i++){
            int swap = 0;
            swap = arr[i];
            arr[i] = arr[a-i-1];
            arr[a-i-1] = swap;
        }
        for (int i = 0; i < a; i++){
            System.out.print(arr[i] + " , ");
        }
    }
}
