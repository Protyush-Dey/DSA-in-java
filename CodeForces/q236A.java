import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a =sc.next();
		HashSet<Character> map = new HashSet<>();
		for(int i=0;i<a.length();i++){
		    map.add(a.charAt(i));
		}
		if(map.size()%2==0) System.out.print("CHAT WITH HER!");
		else System.out.print("IGNORE HIM!");
    }
    
}
