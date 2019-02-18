package exercicio1;

public class Potencia {
	public static float calc(float base,float expoente) {		
		if (base ==1) return 1;	
		if(base==0 && expoente<1) {
			System.out.println("indefinido, divisão por zero");
			return -1;
		}
		if(base==0)return 0;				
		if(expoente>0) return base * calc(base,expoente-1);
		else if(expoente<0) return 1/(base*calc(base,expoente+1));
		else return 1;
	}
}
