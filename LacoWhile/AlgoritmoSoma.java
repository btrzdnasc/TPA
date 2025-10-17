
public class AlgoritmoSoma {

	public static void main(String[] args) {
		
		int i,soma;
		
		i = 1;
		soma = 0;
		
		while(i<=100) {
			soma = soma + i;
			i++;
		}
		
		System.out.println("O total é: " + soma);
		
	}

}
