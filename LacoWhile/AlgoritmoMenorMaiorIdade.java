import java.util.Scanner;

public class AlgoritmoMenorMaiorIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int maior,menor,idade;
		int i;
		
		i = 1;
		maior = 0;
		menor = 0;
		
		while (i<=5) {
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();
			
			if(idade<18) {
				System.out.println("Menor de idade");
				menor = menor + 1;
			} else {
				System.out.println("Maior de idade");
				maior = maior + 1;
			}
		    i++;
		}
		System.out.println("Existem " + maior + " maior de idade");
		System.out.println("Existem " + menor + " menor de idade");
		
        ler.close();
	}

}
