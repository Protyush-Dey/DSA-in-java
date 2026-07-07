import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0; i<n; i++){
	        int a = sc.nextInt();
	        int p=0;
	        p+=a%10;
	        a/=10;
	        p+=a%10;
	        
	        System.out.println(p);
	    }    
	}
}
