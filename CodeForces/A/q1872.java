import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int dif = Math.abs(a-b);
		    int res = (dif + 2*c -1) /(2*c);
		    System.out.println(res);
		    n--;
		}
	}
}
