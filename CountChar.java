import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String listChar;
        String oneChar;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi : ");
        listChar = scanner.nextLine();
        System.out.println("Nhap vao mot ki tu : ");
        oneChar = scanner.nextLine();

        for (int i = 0; i < listChar.length(); i++){
            if(oneChar.equals(String.valueOf(listChar.charAt(i)))){
                count++;
            }
        }
        System.out.println("So lan xuat hien ky tu " + oneChar + " la " + count);
    }
}
