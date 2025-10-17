import java.util.Scanner;

public class AlgoritmoExpoente {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int base,exp,resultado,i;
		
		i = 1;
		
		resultado = 1;
		
		System.out.println("Digite a base: ");
		base = ler.nextInt();
		
		System.out.println("Digite o expoente: ");
		exp = ler.nextInt();
		
		do {
			
			resultado = resultado * base;
			i++;
			
		} while(i<=exp);
		
		System.out.println("Resultado: " + resultado);
		
		ler.close();

	}

}
