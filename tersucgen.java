public class tersucgen {
    public static void main(String[] args) {
        int ix, j, kx;
        for (ix = 8; 0 < ix; ix--) {//Döngümüzün ne kadar döneceğini belirtir.
            for (j = ix; j < 8; j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");
            }
            for (kx = 1; kx <= ix; kx++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }
    }}