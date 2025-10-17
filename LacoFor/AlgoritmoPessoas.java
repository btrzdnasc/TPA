import java.util.Scanner;

public class AlgoritmoPessoas {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i,idade,idade50,idade1020;
		int pesoMenor40,maisVelho,maisNovo;
		double peso,altura,mediaAltura;
		
		idade50 = 0;
		idade1020 = 0;
		pesoMenor40 = 0;
		mediaAltura = 0;
		maisVelho = 0;
		maisNovo = 200;
		
		for (i=1;i<=25;i++) {
			System.out.println("Digite a idade da pessoa " + i + " :");
			idade = ler.nextInt();
			
			System.out.println("Digite a altura da pessoa " + i + " :");
			altura = ler.nextDouble();
			
			System.out.println("Digite o peso da pessoa " + i + " :");
			peso = ler.nextDouble();
			
			if (idade > maisVelho) {
				maisVelho = idade;
			} 
			
			if (idade < maisNovo) {
				maisNovo = idade;
			}
			
			if (idade >=50) {
				idade50 = idade50+1;
			}
			
			if (idade >=10 && idade <=20) {
				idade1020 = idade1020 + 1;
				mediaAltura = mediaAltura + altura;
			}
			
			if (peso < 40) {
				pesoMenor40 = pesoMenor40+1;
			}
			
		}
		
		
		System.out.println("Pessoas com mais de 50 anos: " + idade50);
		System.out.println("Média das alturas entre 10 e 20 anos: " + mediaAltura/idade1020);
		System.out.println("Porcentagem das pessoas com menos de 40kg: " + (pesoMenor40/25)*100 + " %");
		System.out.println("Idade da pessoa mais velha: " + maisVelho);
		System.out.println("Idade da pessoa mais nova: " + maisNovo);
		
		ler.close();

	}

}
