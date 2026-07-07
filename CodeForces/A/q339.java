import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		st = st.replace("+","");
		int n = st.length();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = st.charAt(i) - '0';
		}
		Arrays.sort(arr);
		String res = "";
		for(int i=0;i<n;i++){
		    res +=arr[i];
		    if(i!=n-1){
		        res+='+';
		    }
		}
        System.out.print(res);
	}
}
