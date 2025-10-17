import java.util.Scanner;
public class MediaVetor {
	public static void main (String[]args) {
	    Scanner in = new Scanner (System.in);
	     
	    int a[],i;
	    
	    final int TAM = 10;
	    
	    double media;
	    double soma = 0;
	    a = new int [TAM];
	   
	    // Lendo o vetor A 
	    
	      for (i=0; i<TAM; i++) {
	       System.out.println("Digite o "+(i+1)+"º valor A:");
	       a[i] = in.nextInt();
	       soma = soma + a[i];
	       
	      }
	      
	      // Calculando e apresentando a média
	      
	      media = soma/10;
	      System.out.println("O resultado da média é: " + media);
	      
	      in.close();
    }
	      
}
	      
