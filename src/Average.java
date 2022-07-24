import java.util.Scanner;

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, k=0;
        double total = 0;

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        num = input.nextInt();

        for(int i=0; i <= num ; num--){
            if ( num %3 == 0 && num %4 == 0){
                total += num;
                k++;
            }
        }
        System.out.println(total/k);
    }
}
