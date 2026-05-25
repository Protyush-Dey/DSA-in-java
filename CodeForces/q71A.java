import java.util.Scanner;
public class Main
{
    private static void change(String st){
        int a = st.length();
        if(a<=10){
            System.out.println(st);
            return;
        }
        String ans = "" + st.charAt(0)+(a-2)+st.charAt(a-1);
         System.out.println(ans);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0 ; i<n ; i++){
		    String st = sc.next();
		    change(st);
		}
	}
}
