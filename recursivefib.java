import java.util.Scanner;
public class recursivefib {
    //Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.

    static int fib (int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n1 = input.nextInt();
        System.out.println(fib(n1));

    }
}


