import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++){
		        int x= sc.nextInt();
		        if(x==1){
		            a=i;
		            b=j;
		            break;
		        }
		    }
		}
	    int ans = Math.abs(a-2) + Math.abs(b-2);
	    System.out.print(ans);
	}
}
