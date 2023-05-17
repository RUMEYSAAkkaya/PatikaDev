import java.util.Scanner ;
public class minmaxdegerbulma {
    public static void main(String[] args) {
        /* N tane sayma sayısından en büyük ve en küçük sayıları bulan
         ve bu sayıları ekrana yazan programı yazın  */

        int n ;
        int number;
        int min = 0;
        int max = 0;
        Scanner sca = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = sca.nextInt();
        for (int i = 1; i<= n; i++)
        {
            System.out.print( i + ". sayıyı girin");
            number = sca.nextInt();
            if (number > max)
                max = number;
            if (number < min || min == 0)
                min = number;
        }
        System.out.print("En büyük sayı: " + max);
        System.out.print("En küçük sayı: " +min);
    }}

