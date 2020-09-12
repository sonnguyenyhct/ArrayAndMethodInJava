import java.util.Scanner;

public class TotalDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai mang");
        int x = scanner.nextInt();
        double[][] arrays = new double[x][x];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x;j++){
                System.out.println("Nhap vao phan tu thu " + i + "," + j);
                arrays[i][j] = scanner.nextDouble();
            }
        }
        int total = 0;
        for (int i = 0; i < x; i++){
            total += arrays[i][i];
        }
        System.out.println(total);
    }
}
