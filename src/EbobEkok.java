import java.util.Scanner;

// Burada Önce Küçük Sayıyı Girmek Gerekiyor !!

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        b = input.nextInt();

        for(int i = 1; i <= (a * b); i++){
            if ( i % a == 0 && i % b == 0 ){
                System.out.println(i);
                break;
            }
        }
    }
}

