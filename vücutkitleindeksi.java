import java.util.Scanner ;

public class vücutkitleindeksi {
    public static void main(String[] args) {

    double boy , kg , VKI  ;

    Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz :");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Giriniz : ");
        kg = input.nextDouble() ;

         VKI=  kg / (boy * boy) ;

        System.out.println("VUCUT KİTLE İNDEKSİNİZ : " + VKI);




    }
}
