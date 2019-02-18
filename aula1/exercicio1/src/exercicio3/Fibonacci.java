package exercicio3;

public class Fibonacci {
	public static int fibo(int n) {
		if(n == 0 || n ==1) return 1;
		else return fibo(n-2)+fibo(n-1);
	}
}
