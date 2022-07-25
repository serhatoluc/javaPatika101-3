import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int unit, x, minValue = 0 , maxValue = 0 ;

        System.out.print("Kaç Adet Sayı Gireceksiniz? : ");
        unit = input.nextInt();


        for (int i = 1 ; i <= unit ; i++){

            System.out.print(i + "'inci Sayıyı Giriniz: ");
            x = input.nextInt();


            if (i == 1){
                minValue = x ;
                maxValue = x ;
            }

            if (minValue > x){
                minValue = x ;

            }
            if (maxValue < x){
                maxValue = x ;
            }

        }
        System.out.println("Girdiğiniz Sayılar İçinde En Küçüğü = " + minValue);
        System.out.println("Girdiğiniz Sayılar İçinde En Büyüğü = " + maxValue);
    }
}
