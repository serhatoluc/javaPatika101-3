import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500;
        int select, amount;




        while (right > 0){

            System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            password = input.nextLine();

            if (userName.equals("sekortet") && password.equals("123456")){
                System.out.print("OLUCBank'a Hoşgeldiniz...");
                do{
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: " +
                            "\n 1- Para Yatırma" +
                            "\n 2- Para Çekme" +
                            "\n 3- Bakiye Sorgulama" +
                            "\n 4- Çıkış" +
                            "\n Lütfen Seçiminizi Yapınız: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Mevcut Bakiyeniz: " + balance);
                            System.out.print("Lütfen Yatırmak İstediğiniz Tutarı Giriniz: ");
                            amount = input.nextInt();
                            balance += amount;
                            System.out.println("Yeni Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Mevcut Bakiyeniz: " + balance);
                            System.out.print("Lütfen Çekmek İstediğiniz Tutarı Giriniz: ");
                            amount = input.nextInt();
                            if (amount > balance){
                                System.out.println("Üzgünüz Bu İşlem İçin Bakiyeniz Müsait Değil...");
                            }else{
                                balance -= amount;
                                System.out.println("Yeni Bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            break;
                    }
                }while(select != 4);
                    System.out.println("Tekrar Görüşmek Üzere...");
                    break;
            }else {
                right--;
                System.out.println("Hatalı Bir Giriş Yaptınız Lütfen Tekrar Deneyiniz, Kalan Hakkınız: " + right);
            }
        }
    }
}
