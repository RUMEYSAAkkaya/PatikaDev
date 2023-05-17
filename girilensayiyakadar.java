import java.util.Scanner;

public class girilensayiyakadar {
    /*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
    tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
    public static void main(String[] args) {

        int sayi,toplam=0,onikininkati=0,ortalama=0;
        Scanner input=new Scanner(System.in);


        System.out.println("Sayı giriniz:");
        sayi=input.nextInt();

        while(0<=sayi){
            if(sayi%12==0&&sayi!=0){
                toplam=toplam+sayi;
                onikininkati++;
            }sayi--;
        }ortalama=toplam/onikininkati;


        System.out.println("3 ve 4'e bölünen sayıların ortalaması:"+ortalama);
    }
}



