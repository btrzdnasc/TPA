import java.util.Scanner;

public class algoritmoMaisVelhoMaisNovo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nome1,nome2;
		int idade1,idade2;
		
		System.out.println("Digite o nome da 1º pessoa: ");
		nome1 = ler.next();
		
		System.out.println("Digite a idade da 1º pessoa: ");
		idade1 = ler.nextInt();
		
		System.out.println("Digite o nome da 2º pessoa: ");
		nome2 = ler.next();
		
		System.out.println("Digite a idade da 2º pessoa: ");
		idade2 = ler.nextInt();
		
		if (idade1 > idade2) {
			System.out.println("Mais velho: " + nome1 + " com " + idade1);
			
			System.out.println("Mais novo: " + nome2 + " com " + idade2);
		} else if (idade2 > idade1) {
            System.out.println("Mais velho: " + nome2 + " com " + idade2);
			
			System.out.println("Mais novo: " + nome1 + " com " + idade1);
		} else {
			System.out.println("As duas pessoas tem a mesma idade");
		}
		
	  ler.close();
	}
	
}
