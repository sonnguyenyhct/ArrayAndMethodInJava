import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        int x = scanner.nextInt();
        System.out.println("Nhap vao chieu rong");
        int y = scanner.nextInt();
        double[][] arrays = new double[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y;j++){
                System.out.println("Nhap vao phan tu thu " + i + "," + j);
                arrays[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Nhap vao thu tu 1 cot : ");
        int column = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < x;i++){
            total += arrays[i][column];
        }
        System.out.println("Tong cong phan tu o cot " + column + " la : " + total);
    }
}
