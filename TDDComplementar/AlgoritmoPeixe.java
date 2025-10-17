import java.util.Scanner;

public class AlgoritmoPeixe {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double peso;
		
		System.out.println("Apresente o peso do peixe (kg):");
		peso = ler.nextDouble();
		
		if (peso <= 3) {
			System.out.println("O valor do quilograma é de R$ 12,00");
		} else if (peso > 3 && peso <=5) {
			System.out.println("O valor do quilograma é de R$ 14,00");
		} else if (peso > 5 && peso <=10) {
			System.out.println("O valor do quilograma é de R$ 15,00");
		} else {
			System.out.println("O valor do quilograma é de R$ 17,00");
			System.out.println("Taxa adicional de R$8,00");
		}

	   ler.close();
	}

}
