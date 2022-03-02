import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args) {

        double tutar, kdvOranı = 0.18, kdvTutarı, kdvliTutar, yeniTutar ;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz:");
        tutar = input.nextDouble();
        System.out.print("Kdv'siz Fiyat:");
        System.out.println(tutar);
        yeniTutar = (tutar>1000) ? (kdvTutarı = 0.08 * tutar) : (kdvTutarı = 0.18 * tutar) ;
        kdvliTutar = tutar + kdvTutarı ;
        System.out.print("Kdv Tutarı:" );
        System.out.println(kdvTutarı);
        System.out.print("Kdvli Tutar:");
        System.out.println(kdvliTutar);




    }
}
