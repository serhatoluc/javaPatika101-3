import java.util.Scanner;

/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün
katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

public class OddNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, total = 0;

        do{
            System.out.print("Lütfen Bir Çift Sayı Giriniz: ");
            num = input.nextInt();
            if(num %4 == 0){
                total += num;
            }
        }while (num %2 == 0);
        System.out.print("Girdiğiniz Sayılardan Çift ve 4'e Tam Bölünenlerin Toplamı = " + total);
    }

}
