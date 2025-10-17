import java.util.Scanner;

public class AlgoritmoFibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

        int n, termo1, termo2, proximo, i;
        
        i = 1;
        
        termo1 = 1;
        
        termo2 = 1;

        System.out.print("Informe o número de termos da série de Fibonacci: ");
        n = ler.nextInt();

        do {
            System.out.print(termo1 + " ");
            proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;
            
            i++;
            
        } while (i <= n);

        ler.close();

	}

}
