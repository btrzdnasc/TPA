import java.util.Scanner;

public class AlgoritmoTabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n,m;
		int i;
		
		System.out.println("Informe o número que deseja saber a tabuada: ");
		n = ler.nextInt();
		
		i = 1;
		
		
		while (i <= 10) {
			
			m = n*i;
			System.out.println(n + " * " + i + " = " + m ); 
			
			i++;
		} 
		
       ler.close();
	}

}
