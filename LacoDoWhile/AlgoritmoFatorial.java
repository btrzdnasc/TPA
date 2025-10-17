import java.util.Scanner;

public class AlgoritmoFatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n,multi,i;
		
		i = 1;
		multi = 1;
		
		System.out.println("Informe o número que deseja saber a fatoração: ");
		n = ler.nextInt();
		
		do {
			
		multi = multi * i;
		i++;
		
		} while(n >= i); 
		
		System.out.println("O valor da fatoração é de: " + multi);
		
		ler.close();
	}

}
