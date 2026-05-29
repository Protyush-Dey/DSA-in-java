import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		st = Character.toUpperCase(st.charAt(0)) + st.substring(1);
		System.out.print(st);
	}
}
