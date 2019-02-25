package exercicio6;

public class Surprise {
	public static int sur(int a,int b) {			
		if (b<0) {
			if (b==-1) {
				return -a;
			}
			else {
				return -a + sur(a,b+1);
			}
		}
		if (b==0) {
			return 0;
		}
		else if (b==1) {
			return a;
		}
		else {
			return a + sur(a,b-1);
		}
		
	}
}
