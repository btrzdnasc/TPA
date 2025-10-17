import java.util.Scanner;

public class algoritmoBhaskara {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double valorA,valorB,valorC,delta;
		double raiz,raiz1,raiz2;
		
		System.out.println("Apresente o valor A: ");
        valorA = ler.nextDouble();
        
        System.out.println("Apresente o valor B: ");
		valorB = ler.nextDouble();
		
		System.out.println("Apresente o valor C: ");
		valorC = ler.nextDouble();
		
		delta = (valorB*valorB)-(4*valorA*valorC);
		
		System.out.println("O valor de delta é: " + delta);
		
		if (delta < 0) {
			System.out.println("Não existem raízes reais para a equação");
		} else if (delta == 0) {
			raiz = (-valorB)/(2*valorA);
			System.out.println(raiz);
		} else {
			raiz1 = (-valorB + Math.sqrt(delta))/(2*valorA);
			raiz2 = (-valorB - Math.sqrt(delta))/(2*valorA);
			System.out.println(raiz1);
			System.out.println(raiz2);
		}
	
	  ler.close();
		
	}

}
