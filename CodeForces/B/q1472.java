import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[2];
		for(int i= 0; i< n; i++){
		    int k = sc.nextInt();
		    for(int j= 0; j< k; j++){
		        int l = sc.nextInt();
		        arr[l-1]++;
		    }
            if((arr[0]+arr[1]*2)%2== 1){
                System.out.println("NO");
            }
		    else if(arr[0]== 0 && arr[1]%2== 1){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		    Arrays.fill(arr , 0);
		}
	}
}
