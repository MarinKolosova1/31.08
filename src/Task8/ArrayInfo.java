package Task8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInfo{
    static int n = 14;
    static int[] arr = new int[n];

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n_neg = 0;
        int n_pos = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.print("Максимальное значение: " + max + "\n");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                n_pos++;
            }
        }
        System.out.println("Сумма положительных элементов: " + sum);

        sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 & arr[i] % 2 == 0) {
                sum += arr[i];
                n_neg++;
            }
        }
        System.out.println("Сумма четных отрицательных элементов: " + sum);
        System.out.println("Количество положительных элементов: " + n_pos);

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 & arr[i] % 2 != 0){
                sum += arr[i];
                n_neg++;
            }
        }
        if (n_neg == 0) System.out.println("Среднее арифметическое отрицательных элементов не может быть вычислено, так как в массиве нет отрицательных элементов.");
        else System.out.println("Среднее арифметическое отрицательных элементов: " + (double) sum / n_neg);

    }
}
