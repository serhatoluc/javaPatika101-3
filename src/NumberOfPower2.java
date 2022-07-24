import java.util.Scanner;

/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */

public class NumberOfPower2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        num = input.nextInt();

        for(int i = 1; i <= num; i *= 4){
            System.out.println(i);
        }
        for(int k = 1; k <= num; k *= 5){
            System.out.println(k);
        }
    }
}
