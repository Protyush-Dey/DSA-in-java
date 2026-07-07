import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = 240 - k;
		int s = 0;
		int c = 0;
		for(int i = 1 ; i <= n ; i++){
		  s+= 5*i;
		  if(x<s) break;
		  c++;
		}
		System.out.print(c);
	}
}
