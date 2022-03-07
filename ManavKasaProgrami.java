import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, toplamTutar;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Girilen değerler ondalık ise virgül kullanarak ayırınız!!");

        System.out.print("Armut kaç kilo ? :");
        armut = girdi.nextDouble();
        armut = armut * 2.14;

        System.out.print("Elma kaç kilo ? :");
        elma = girdi.nextDouble();
        elma = elma * 3.67;

        System.out.print("Domates kaç kilo ? :");
        domates = girdi.nextDouble();
        domates = domates * 1.11;

        System.out.print("Muz kaç kilo ? :");
        muz = girdi.nextDouble();
        muz = muz * 0.95;

        System.out.print("Patlıcan kaç kilo ? :");
        patlican = girdi.nextDouble();
        patlican = patlican * 5;

        toplamTutar = armut+elma+domates+muz+patlican;
        System.out.print("toplam Tutar :"+toplamTutar);



    }
}
