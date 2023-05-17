import java.util.Scanner ;

public class havasicakligi {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat= input.nextInt();


        if (heat < 5) {
            System.out.println("Kayak Yapabilirsinin.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsin.");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe Gidebilirsiniz.");}

                  }
             else {
                System.out.println("Yüzmeye Gidebilirsiniz.");

                  }



        }
    }