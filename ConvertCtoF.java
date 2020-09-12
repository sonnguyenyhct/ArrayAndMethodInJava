import java.util.Scanner;

public class ConvertCtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        double convert;
        do {
            System.out.println("1. Fahrenheit to Celsius\n" +
                    "\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "\n" +
                    "0. Exit ");
            check = scanner.nextInt();
            switch (check){
                case 1 :
                    System.out.println("Nhap vap do C");
                    convert = scanner.nextDouble();
                    System.out.println(FToC(convert));
                    break;
                case 2 :
                    System.out.println("Nhap vap do F");
                    convert = scanner.nextDouble();
                    System.out.println(CToF(convert));
                    break;
            }
        }while (check == 0);
    }
    public static double FToC(double f){
        return ((5.0 / 9) * (f - 32));
    }
    public static double CToF(double c){
        return c/(5.0 / 9) + 32;
    }
}
