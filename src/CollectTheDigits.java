import java.util.Scanner;

/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
 */

public class CollectTheDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, newNumber, basNumber = 0;
        int firstNumber = 0;
        int total = 0;

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        num = input.nextInt();

        firstNumber = num;

        while (firstNumber != 0){
            firstNumber /= 10;
            basNumber++;
        }
        firstNumber = num;

        for(int i = 1; i<= basNumber; i++){
            total += (firstNumber % 10);
            firstNumber /= 10;
        }
        System.out.println("Girdiğiniz Sayının Basamakları Toplamı = " + total);
    }
}
