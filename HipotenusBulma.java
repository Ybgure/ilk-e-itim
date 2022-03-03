import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        int a, b, c;
        double alan, cevre;

        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk Kenar Uzunluğunu Giriniz :");
        a = girdi.nextInt();
        System.out.print("İkinci Kenar Uzunluğunu Giriniz :");
        b = girdi.nextInt();
        System.out.print("Üçüncü Kenar Uzunluğunu Giriniz :");
        c = girdi.nextInt();
        cevre = (a+b+c) / 2 ;
        alan = Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));
        System.out.println("Üçgenin Alanı :" + alan);

    }
}
