import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0; i<n; i++){
	        int p = sc.nextInt();
	        int q = sc.nextInt();
	        int r = sc.nextInt();
	        if(p==r)System.out.println(q);
	        else if(p==q)System.out.println(r);
	        else System.out.println(p);
	    }
    }
}
