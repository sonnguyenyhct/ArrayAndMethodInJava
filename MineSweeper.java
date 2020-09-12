import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        int x = scanner.nextInt() + 2;
        System.out.println("Nhap vao chieu rong");
        int y = scanner.nextInt() + 2;
        String[][] arrays = new String[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y;j++){
                double random = Math.random();
                if (i == 0 || j == 0 || i == x-1 || j == y-1){
                    arrays[i][j] = "";
                }else {
                    if (random < 0.2){
                        arrays[i][j] = " * ";
                    }else {
                        arrays[i][j] = " . ";
                    }
                    System.out.print(arrays[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("ma tran");
        for (int i = 1; i < x-1; i++){
            for (int j = 1; j < y-1;j++){
                if (arrays[i][j].equals(" . ")){
                    int bom = 0;
                    for (int h = -1;h <= 1; h++){
                        for (int k = -1; k <= 1; k++){
                            if (arrays[i+h][j+k].equals(" * ")){
                                bom++;
                            }
                        }
                    }
                    arrays[i][j] = " " + bom + " ";
                }
            }
        }
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y;j++){
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }
}
