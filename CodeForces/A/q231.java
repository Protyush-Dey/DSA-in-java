import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=0;
		for(int i=0;i<n;i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    x+=(a+b+c)>=2?1:0;
		}
		System.out.print(x);
	}
}
