package Task3;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) n++;
        System.out.println(n);
    }
}
