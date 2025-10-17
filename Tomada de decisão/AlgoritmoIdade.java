package projectsFacilimos;

import java.util.Scanner;

public class AlgoritmoIdade {
     
	   public static void main(String[] args) {
	       Scanner ler = new Scanner(System.in);
		   int anoAtual, anoNascimento, idade;
		   
		   System.out.println("Escreva o ano atual: ");
		   anoAtual = ler.nextInt();
		   
		   System.out.println("Escreva o seu ano de nascimento: ");
		   anoNascimento = ler.nextInt();
		   
		   idade = anoAtual-anoNascimento;
		   
		   System.out.println("A sua idade é: " + idade);
		   if (idade < 18) {
			   
			   System.out.println("Menor de idade, não pode dirigir");
			      
		   } else {
			   
			  System.out.println("Maior de idade, pode dirigir");
			   
		   }
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
