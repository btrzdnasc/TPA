import java.util.Scanner;

public class algoritmoIrpf {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double salario,desconto;
		
		System.out.println("Apresente o seu salário: ");
		salario = ler.nextDouble();
		
		if (salario <= 1434.59) {
			desconto = 0;
		} else if (salario <= 2150.00) {
			desconto = salario * 0.075;
		} else if (salario <= 2866.70) {
			desconto = salario * 0.015 - 107.59;
		} else if (salario <= 3582.00) {
			desconto = salario * 0.225 - 268.84;
		} else {
			desconto = salario * 0.275 - 483.84;
		}
		
		System.out.println("O desconto é de: " + desconto);
		
		ler.close();
	}

}
