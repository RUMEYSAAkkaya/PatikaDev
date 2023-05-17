import java.util.Scanner;
public class recursiveuslusayi {
    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz :");
        int taban = input.nextInt();
        System.out.print("Üs Değerini Giriniz :");
        int us = input.nextInt();
        int sonuc =1;

        for (int i=1;i<=us;i++){
            sonuc *= taban;
        }
        System.out.print("Sonuç :" +sonuc);
    }
    public static void main(String[] args) {

        power();
    }
}
