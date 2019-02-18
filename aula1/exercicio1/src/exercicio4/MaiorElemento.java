package exercicio4;
import java.util.Arrays;

public class MaiorElemento {
	public static int[] maior(int[] arr) {
		int a = arr[0];
		int b = arr[arr.length-1];
		if(arr.length==1) {
			return arr;
		}
		if(arr.length==2) {			
			return arr= new int[] {(a>=b)?a:b};
		}
		else {						
			return (a>=b)? maior(Arrays.copyOfRange(arr, 0, arr.length-1)): maior(Arrays.copyOfRange(arr, 1, arr.length));
		}		
	}
}
