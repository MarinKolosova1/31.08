package Task7;

import java.util.Scanner;

public class CallCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        switch (n) {
            case 905 -> System.out.println("Москва. Стоимость разговора: 41.5");
            case 194 -> System.out.println("Ростов. Стоимость разговора: 19.8");
            case 491 -> System.out.println("Краснодар. Стоимость разговора: 26.9");
            case 800 -> System.out.println("Киров. Стоимость разговора: 50.0");
        }
    }
}
