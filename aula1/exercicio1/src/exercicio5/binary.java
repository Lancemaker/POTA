package exercicio5;

public class binary {
	static String s ="";
	public static int bin(int n) {			
			s=n%2+s;
			if(n>1) return bin(n/2);
			else return 1;
	}
}
