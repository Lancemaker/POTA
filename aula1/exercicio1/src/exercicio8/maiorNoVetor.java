package exercicio8;

import java.util.Arrays;

public class maiorNoVetor {
static int count=0;
public static int[] soma(int[] arr) {
	int a = arr[0];
	if(arr.length==1) {
		System.out.println(count+arr[0]);
		return arr;
	}
	count+=a;
	
	return soma(Arrays.copyOfRange(arr, 1, arr.length));		
}
}

