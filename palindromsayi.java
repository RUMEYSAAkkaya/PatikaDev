import java.util.Scanner;
public class palindromsayi {
    /*Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.*/

     static boolean polindrom(int num){
        boolean isPoli=true;
        int firstNumber=0;
        int count=0;
        int lastNumber=0;
        int tempNumber=num;
        while (tempNumber!=0){
            count=tempNumber%10;
            lastNumber=(10*lastNumber)+count;
            tempNumber/=10;
        }
        isPoli=(lastNumber==num);

        return isPoli;

    }
    public static void main(String[] args) {
        int number;
        System.out.println("please enter a number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        System.out.println(polindrom(number));

    }

}