import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;

        System.out.print("Lütfen Kaç Basamaklı Üçgen Oluşturmak İstediğinizi Tuşlayın: ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++){
            for(int k = 1; k <= (a-i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = (a-1); i >= 1; i--){
            for (int k = (a-i); k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = (2*i) - 1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
