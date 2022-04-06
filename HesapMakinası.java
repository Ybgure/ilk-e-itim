import java.util.Scanner;


public class HesapMakinası {
    public static void main(String[] args) {
        int  islem, sayı1, sayı2 ;
        float sonuç;

        System.out.println("LÜTFEN SAYILARI TAM SAYI GİRİNİZ");

        Scanner input = new Scanner(System.in);
        System.out.print("ilk Sayıyı Seçiniz : ");
        sayı1 = input.nextInt();
        System.out.print("ikinci Sayıyı Seçiniz : ");
        sayı2 = input.nextInt();

        System.out.println("İşlemi Seçiniz\n1-toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("işlem : ");
        islem = input.nextInt();

        switch (islem){
            case 1:
                sonuç = sayı1 + sayı2;
                System.out.println("Sayıların Toplamı : " + sonuç);
                break;

            case 2:
                sonuç = sayı1 - sayı2;
                System.out.println("Sayıların Farkı : " + sonuç);
                break;

            case 3:
                sonuç =  sayı1 * sayı2;
                System.out.println("Sayıların Çarpımı : " + sonuç);
                break;

            case 4:
                if ( sayı2 == 0 ){
                    System.out.println("Sayı2 Bölme İşleminde 0 Olamaz");
                        break;
                }
                else  {
                    sonuç = sayı1 / sayı2;
                    System.out.println("Sayıların Bölümü : " + sonuç);
                    break;
                }



            default:
                System.out.println("Hatalı İşlem Seçtiniz");
                break;
        }



    }
}
