import java.util.Scanner;

public class AlgoritmoRenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1;
		int soma = 0, renda, maior = 0, media;
		
		
		
		while (i <= 40) {
			
			System.out.println("Apresente a renda do " + i + " aluno:");
			renda = ler.nextInt();
			
			soma = soma + renda;
			
			   if (maior < renda) {
				
				  maior = renda; 
				
			   }
			   
			i++;
		}
		
		media = soma/40;
		
		System.out.println("A soma das rendas é igual: " + soma);
		
		System.out.println("A média das rendas é igual: " + media);
		
		System.out.println("A renda mais alta é de: " + maior);
		
		ler.close();
			
		}
				
    }