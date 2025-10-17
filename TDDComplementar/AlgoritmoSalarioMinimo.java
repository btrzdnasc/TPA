import java.util.Scanner;

public class AlgoritmoSalarioMinimo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double salario,salarioMinimo,diferenca;
		
		System.out.println("Digite o salário atual: ");
        salario = ler.nextDouble();
        
        System.out.println("Digite o valor do salário mínimo: ");
		salarioMinimo = ler.nextDouble();
		
		diferenca = salario - salarioMinimo;
		
		if(salario>salarioMinimo) {
			System.out.println("A pessoa recebe acima do salário mínimo");
			System.out.println("Recebe R$ " + diferenca + " a mais");
		} else if (salario<salarioMinimo) {
			System.out.println("A pessoa recebe abaixo do salário mínimo");
			System.out.println("Recebe R$ " + diferenca + " a menos");
		} else {
			System.out.println("A pessoa recebe exatamente o salário mínimo");
		}
		
	  ler.close();	
	}

}
