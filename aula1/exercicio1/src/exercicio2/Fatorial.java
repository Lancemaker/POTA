package exercicio2;

public class Fatorial {
	public static int fat(int num) {
		if (num>0) {
			return num * fat(num-1);
		} 
			
		else return 1;
	}
}
