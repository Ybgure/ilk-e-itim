import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double kilo, boy, kitleIndeksi ;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Boy ve Kilo değerlerini ondalık girecekseniz Virgül kullanarak yazınız !!!");


        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = girdi.nextDouble();
        System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz :");
        kilo = girdi.nextDouble();

        kitleIndeksi = kilo / ( boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+kitleIndeksi);
    }
}
