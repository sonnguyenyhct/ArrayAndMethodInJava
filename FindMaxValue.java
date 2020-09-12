import java.util.Scanner;

public class FindMaxValue {
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
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < a;i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
