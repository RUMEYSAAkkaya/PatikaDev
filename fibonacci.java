import java.util.Scanner ;
public class fibonacci {
    public static void main(String[] args) {
        //Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç sayı olsun? ");
        int sayiAdedi = input.nextInt();

        int ilkSayi = 0, ikinciSayi = 1;
        System.out.print(ilkSayi + " " + ikinciSayi);

        for(int i = 2; i < sayiAdedi; i++) {
            int sonrakiSayi = ilkSayi + ikinciSayi;
            System.out.print(" " + sonrakiSayi);
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
        }
    }

