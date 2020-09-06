package Task2;

import java.util.Scanner;

public class DigitSumm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n < 100 | n > 999) {
            System.out.println("Введите трехзначное число.");
            n = in.nextInt();
        }
        int sum = n % 10; n = n / 10;
        sum += n % 10; n = n / 10;
        sum += n % 10;
        System.out.println(sum);
    }
}
