import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] dp = new int[x + 1];
		for (int i = 1; i <= x; i++) {
			dp[i] = Integer.MAX_VALUE;

			for (int j = 1; j <= 5; j++) {
				if (i - j >= 0)
					dp[i] = Math.min(dp[i], dp[i - j] + 1);
			}
		}

		System.out.println(dp[x]);
	}
}
