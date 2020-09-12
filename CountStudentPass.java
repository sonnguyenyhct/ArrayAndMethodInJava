import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPass = 0;
        int total;
        do {
            System.out.println("Nhap vao so luong sinh vien (it hon 30)");
            total = scanner.nextInt();
            if (total > 30){
                System.out.println("Nhap lai so luong sinh vien");
            }
        }while (total > 30);
        int[] listScore = new int[total];
        for (int i = 0; i < total; i++){
            System.out.println("Nhap vao diem sinh vien thu tu " + (i+1));
            listScore[i] = scanner.nextInt();
            if (listScore[i] >= 5 && listScore[i] <= 10){
                totalPass++;
            }
        }
        System.out.println("So luong sinh vien do la : " + totalPass);
    }
}
