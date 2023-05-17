import java.util.Scanner ;
public class sinifgecme {
    public static void main(String[] args) {


        int mat, fiz, tur, kim, muz;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fiz = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        tur = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kim = inp.nextInt();
        System.out.print("Muzik notunuzu giriniz:");
        muz = inp.nextInt();


        double avarege = (mat + fiz + tur + kim + muz) / 5;
        if (avarege <= 55) {
            System.out.println("Ortalamanız : " + avarege);
            System.out.println("Tekrar Deneyiniz");
        } else {
            System.out.println("Ortalamanız : " + avarege);
            System.out.println("Sınıfı Geçtiniz ");}

             if ((mat > 0) && (mat < 100 ));{
             System.out.print("Hatalı giriş! ");}


    }
}