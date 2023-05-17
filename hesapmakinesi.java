import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı yazınız : ");
        n1 = input.nextInt();
        System.out.println("2.sayıyı yazınız : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama \n 2-Çıkarma \n 3- Çarpma \n 4-Bölme ");
        select = input.nextInt();
        System.out.println("Seçiniz : ");

        switch (select) {
            case 1:
                System.out.print("Toplam : " + (n1 + n2));
                break;

            case 2:
                System.out.print("Çıkarma: " + (n1 - n2));
                break;

            case 3:
                System.out.print("Çarpma : " + (n1 * n2));
                break;

            case 4:
                System.out.print("Bölme : " + (n1 / n2));
                break;

            default:
                System.out.println("Tekrar Deneyiniz ");


        }


    }
}
