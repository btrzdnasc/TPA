import java.util.Scanner;

public class algoritmoImc {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double peso,altura,imc;
		
		System.out.println("Apresente o peso: ");
        peso = ler.nextDouble();
        
		System.out.println("Apresente a altura: ");
		altura = ler.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println("O IMC é de: " + imc);
		
		 if (imc < 18.5) {
	            System.out.println("Excesso de Magreza");
	        } else if (imc >= 18.5 && imc < 25) {
	            System.out.println("Peso Normal");
	        } else if (imc >= 25 && imc < 30) {
	            System.out.println("Excesso de Peso");
	        } else if (imc >= 30 && imc < 35) {
	            System.out.println("Obesidade Grau I");
	        } else if (imc >= 35 && imc < 40) {
	            System.out.println("Obesidade Grau II");
	        } else {
	            System.out.println("Obesidade Grau III");
	        }

	     ler.close();
		
	}

}
