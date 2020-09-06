package Task4;

import java.util.Scanner;

public class PositiveNeativeZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) n++;
        else if (n < 0) n-=2;
             else n = 10;
        System.out.println(n);
    }
}
