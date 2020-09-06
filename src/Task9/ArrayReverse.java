package Task9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = 14;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int buf;
        for (int i = 0; i < n/2; i++) {
                    buf = a[i];
                    a[i] = a[n-i-1];
                    a[n-1-i] = buf;
        }
        System.out.println(Arrays.toString(a));
    }
}
