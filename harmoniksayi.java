import java.util.Scanner;

public class harmoniksayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n;
        double toplam=0;
        System.out.println("N sayısını giriniz:");
        n=input.nextInt();

        for(int i=1;i<=n;i++){
            toplam=toplam+(1.0/i);
        }
        System.out.println("Sayının harmonik serisi:"+toplam);
    }
}

