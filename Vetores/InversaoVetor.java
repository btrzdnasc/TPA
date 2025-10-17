import java.util.Scanner;
public class InversaoVetor {
	 public static void main(String[] args) {
	 Scanner in = new Scanner (System.in);
	   
	   final int TAM = 10;
	   int a[],b[],i;
	   a = new int [TAM];
	   b = new int [TAM];
	   
	   // Lendo o vetor A 
	   
	     for (i=0; i<TAM; i++) {
	      System.out.println("Digite o "+(i+1)+"º valor A:");
	      a[i] = in.nextInt();
	      b[i] = a[i];
	     }
	     
	     // Apresentando o vetor B
	     
	     System.out.print("B = [");
	     
	     for (i = 9;i<TAM && i > -1; i--) {
	      System.out.print(b[i]+" ");
	     }
	     
	     System.out.print("]");
	     
	     in.close();
	 }

	}