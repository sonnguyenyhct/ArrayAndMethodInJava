import java.util.Scanner;

public class FindMaxValueArray {
    public static void main(String[] args) {
        double[][] distances = {
                {0, 983, 787, 714, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1627},
                {714, 1102, 888, 0, 661, 781, 810},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 0, 239},
                {1087, 1842, 1627, 810, 1187, 239, 0},
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        int x = scanner.nextInt();
        System.out.println("Nhap vao chieu rong");
        int y = scanner.nextInt();
        double[][] array = new double[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y;j++){
                System.out.println("Nhap vao phan tu thu" + i + "," + j);
                array[i][j] = scanner.nextDouble();
            }
        }

        double maxValue = array[0][0];
        for (double[] doubles : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (doubles[j] > maxValue) {
                    maxValue = doubles[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length;j++){
                if (maxValue == array[i][j]){
                    System.out.println(i + "," + j);
                }
            }
        }
        System.out.println(maxValue);
    }
}
