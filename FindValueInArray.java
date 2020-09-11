import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten : ");
        String name = scanner.nextLine();
        for (int i = 0; i < students.length;i++){
            if (name.equals(students[i])){
                System.out.println("Ten o vi tri " + (i+1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Khong tim thay");
        }
    }
}
