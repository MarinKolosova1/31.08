package Task1;

import java.util.Scanner;

public class LastNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ld = n % 10;
        System.out.println(ld);
    }
}
