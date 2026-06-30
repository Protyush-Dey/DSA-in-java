import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    String s = sc.next();
        if(a<26){
            System.out.println("NO");
            return;
        }
        s = s.toLowerCase();
        int arr[] =  new int[26];
        for(int i=0;i<a;i++){
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
	}
}
