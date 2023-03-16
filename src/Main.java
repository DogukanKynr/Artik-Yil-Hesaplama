import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int year;

        System.out.print("Yıl giriniz : ");
        year = input.nextInt();

        if((year%4) == 0) {
            System.out.println(year + " Bir artık yıldır!");
        }else if(((year%100) == 0) && (year%400 == 0)) {
            System.out.println(year + " Bir artık yıldır!");
        }else {
            System.out.println(year + " Bir artık yıl değildir!");
        }
    }
}