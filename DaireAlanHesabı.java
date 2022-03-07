import java.util.Scanner;

public class DaireAlanHesabı {
    public static void main(String[] args) {

        double r, pi = 3.14, merkezAçı, daireDilimininAlanı ;

        Scanner girdi = new Scanner(System.in);
        //Yarı Çap ve Merkez Açıyı Ondalıklı Yazacaksanız Virgül Kullanarak Yazınız.
        System.out.println("Yarıçap ve Merkez açı değerlerini ondalık olarak belirtecekseniz virgül kullanınız !");

        System.out.print("Yarı Çapı Giriniz:");
        r = girdi.nextDouble();
        System.out.print("Merkez Açıyı Giriniz:");
        merkezAçı = girdi.nextDouble();

        daireDilimininAlanı = (pi*(r*r)*merkezAçı)/360;
        System.out.println("Daire Diliminin Alanı:" + daireDilimininAlanı);


    }




}
