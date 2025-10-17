package projectsFacilimos;
   import java.util.Scanner;
public class AlgoritmoNumeroInteiro {
   public static void main(String[] args) {
	   Scanner ler = new Scanner (System.in);
	   int inteiroNumero, resultado;
	   
	   System.out.println("Escreva o Número Inteiro: ");
	   inteiroNumero = ler.nextInt();
	   
	   resultado = inteiroNumero/2;
	   
	   
	   
	   if (resultado % 2 == 0 ) {
			
		     System.out.println("Número par");
	
		     
	  } else {
		 
		    System.out.println("Número ímpar");
	  }
	
	}


	
}

