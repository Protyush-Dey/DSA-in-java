
// A. Watermelon

import java.util.Scanner;

public class Watermelon {
    public static boolean check(int a) {
        return (a % 2 == 0 && a > 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (check(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
