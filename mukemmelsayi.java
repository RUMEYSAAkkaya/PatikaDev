
import java.util.Scanner;
public class mukemmelsayi {
    public static void main(String[] args) {
       /* Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        kendisine eşit olan sayıya mükemmel sayı denir. */
        // 6 mükemmel sayıdır çünkü 1, 2 ve 3 pozitif tam bölenleridir ve 1 + 2 + 3 = 6

        Scanner input =new Scanner(System.in);
        int sayi,toplam=0;

        System.out.println("Sayı giriniz:");
        sayi=input.nextInt();

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){toplam=toplam+i;}
        }if(toplam==sayi){
            System.out.println(sayi+" Mükemmel sayıdır.");
        }else {
            System.out.println(sayi+" Mükemmel sayı değildir.");
        }
    }
}



