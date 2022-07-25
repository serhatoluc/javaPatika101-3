import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y = 0, total = 0;

        while (true){

            System.out.print("Lütfen Bir Sayı Giriniz: ");
            x = input.nextInt();

            for(int i = 2; i < x; i++){
                if (x % i == 0){
                    y = i;
                    total += y;
                }
            }
            total += 1;
            if(total == x && x != 1) {
                System.out.println(total + " Bir Mükemmel Sayıdır!");
            }else{
                System.out.println(x +" Bir Mükemmel Sayı Değildir.");
            }
        }
    }
}