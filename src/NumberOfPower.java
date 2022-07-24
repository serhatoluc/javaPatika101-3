import java.util.Scanner;


public class NumberOfPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b, total = 1;

        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen Üs Olacak Sayıyı Giriniz: ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++){
            total *= a;
        }
        System.out.println(a + "'nın " + b + "'ninci kuvveti = " + total);

    }
}
