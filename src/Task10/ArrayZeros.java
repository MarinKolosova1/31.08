package Task10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = 14;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                for (int j = i; j < (n - 1); j++) {
                    a[j] = a[j + 1];
                }
                a[n-1] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
