import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih = input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        double sonuc = (mat+fizik+kimya+turkce+tarih+muzik) / 6;

        System.out.println(sonuc>60 ? sonuc + " Sınıfı Geçti" : sonuc + " Sınıfta Kaldı");
    }
}