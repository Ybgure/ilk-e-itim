import java.util.Scanner;

public class GectiKaldi {

    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik ;

        Scanner dersler = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = dersler.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = dersler.nextInt();

        System.out.print("MTurkce notunuz :");
        turkce = dersler.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = dersler.nextInt();

        System.out.print("Muzik notunuz :");
        muzik = dersler.nextInt();

        double toplam = (mat + muzik + turkce + fizik + kimya) ;
        double ortalama = toplam / 5 ;


        System.out.print("ortalamanız :");
        System.out.println(ortalama);

        String Sonuc;

        Sonuc = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;

        System.out.println(Sonuc);
    }


}
