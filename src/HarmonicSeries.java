import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        double part = 0.0, result = 0.0;

        System.out.print("Lütfen bir sayı giriniz: ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++){
            part = (1.0/i);
            result += part;
        }
        System.out.println("Girmiş olduğunuz sayının harmonik seri sonucu = " + result);
    }
}
