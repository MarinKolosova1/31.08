package Task6;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) System.out.print("положительное ");
        else if (n < 0) System.out.print("отрицательное ");
        else {
            System.out.println("нулевое число");
            System.exit(0);
        }

        if (n % 2 == 0) System.out.println("четное число");
        else System.out.println("нечетное число");
    }
}
