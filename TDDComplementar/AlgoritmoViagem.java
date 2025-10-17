import java.util.Scanner;

public class AlgoritmoViagem {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double reais,valorConvertido,cotacaoEuro,cotacaoDolar,cotacaoPeso;
		int tipoViagem;
		
		cotacaoEuro = 5.50;
		cotacaoDolar = 5;
		cotacaoPeso = 0.05;
		
		System.out.println("Digite a quantidade de reais que vai levar na viagem: ");
        reais = ler.nextDouble();
        
        System.out.println("Digite o tipo de viagem (1 - Nacional, 2 - Europeia, 3 - Norte-Americana, 4 - Sul-Americana): ");
		tipoViagem = ler.nextInt();
		
		if (tipoViagem == 1) {
			System.out.println("Você levará R$ " + reais + " para a viagem");
		} else if (tipoViagem == 2) {
			valorConvertido = reais/cotacaoEuro;
			System.out.println("Você levará € " + valorConvertido + " para a viagem");
		} else if (tipoViagem == 3) {
			valorConvertido = reais/cotacaoDolar;
			System.out.println("Você levará $ " + valorConvertido + " para a viagem");
		} else if (tipoViagem == 4) {
			valorConvertido = reais/cotacaoPeso;
			System.out.println("Você levará $ " + valorConvertido + " para a viagem");
		} else {
			System.out.println("Tipo de viagem inválido");
		}
		
	  ler.close();	
	}

}
