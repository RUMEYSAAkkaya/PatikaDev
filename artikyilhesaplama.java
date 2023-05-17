import java.util.Scanner;

public class artikyilhesaplama {
    public static void main(String[] args) {
        //Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır.
        int  yil ;
        Scanner input = new Scanner (System.in);
        System.out.println("ARTIK YIL HESAPLAMA PROGRAMINA HOŞ GELDİNİZ :) ");

        System.out.println("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil%4 == 0 ){
        System.out.println("bir artık yıldır "+ yil);}

         else if (( yil %100==0)&&( yil %400 ==0)){
            System.out.println("bir artık yıldır "+ yil);}

         else {
        System.out.println("bir artık yıl değildir ");





    }
}}
