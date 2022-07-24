import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, totalA = 1, totalB = 1, totalAB = 1;

        System.out.print("Lütfen Kombinasyonun İlk Terimini Giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen Kombinasyonun İkinci Terimini Giriniz : ");
        b = input.nextInt();

        for (int i = 1; i <= a; i++){
            totalA *= i;
        }
        for (int i = 1; i <= b; i++){
            totalB *= i;
        }
        for (int i = 1; i <= (a-b); i++){
            totalAB *= i;
        }
        System.out.println(a + "'nin" + b + "'li kombinasyonu = " + (totalA/(totalB * totalAB)));
    }
}
