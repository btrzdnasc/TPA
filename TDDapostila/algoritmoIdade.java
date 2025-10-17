import java.util.Scanner;

public class algoritmoIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
        
		int anoAtual,anoNascimento,idade;
        
		System.out.println("Informe o ano atual: ");
		anoAtual = ler.nextInt();
		
		System.out.println("Informe o seu ano de nascimento: ");
		anoNascimento = ler.nextInt();
		
		idade = anoAtual-anoNascimento;
		
		System.out.println("Idade:" + idade);
		
		if(idade<10) {
			System.out.println("Criança");
		} else if (idade >= 10 && idade < 18) {
			System.out.println("Adolescente");
		} else if (idade >= 18 && idade < 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		
       ler.close();
	}

}
