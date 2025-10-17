package projectsFacilimos;
import java.util.Scanner;
public class AlgoritmoNumero {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeroInteiro;
		
		System.out.println("Escreva o número inteiro: ");
		numeroInteiro = ler.nextInt();
		
		if (numeroInteiro<0) {
		
		     System.out.println("Negativo");
	
	  } else if (numeroInteiro==0) {
		
		     System.out.println("Neutro");
		     
	  } else {
		 
		    System.out.println("Positivo");
	  }
	
	}

  }
