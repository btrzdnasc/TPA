import java.util.Scanner;

public class algoritmoMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double nota1,nota2,media,notaExame,novaMedia;
		
		System.out.println("Digite a primeira nota:");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = ler.nextDouble();
		
		media = (nota1+nota2)/2;
		
		System.out.println("A média é de: " + media);
		
		if (media < 3) {
			System.out.println("Reprovado");
		} else if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Exame");
			
			System.out.println("Digite a nota do exame: ");
			notaExame = ler.nextDouble();
			
			novaMedia = (media + notaExame)/2;
			
			System.out.println("A nova média é: " + novaMedia);
			
			if (novaMedia >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");	
			}
			
		}
		
	    ler.close();
	}

}
