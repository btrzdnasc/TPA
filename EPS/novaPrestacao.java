import java.util.Scanner;
public class novaPrestacao {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
     
        double valorOriginal, taxa, tempo, prestacao;

        System.out.println("Digite o valor original da prestação: ");
        valorOriginal = ler.nextDouble();

        System.out.println("Digite a taxa de juros aplicada: ");
        taxa = ler.nextDouble();

        System.out.println("Digite a quantidade de tempo do atraso: ");
        tempo = ler.nextDouble();

        prestacao = valorOriginal + ((valorOriginal * (taxa / 100) * tempo));

        System.out.println("O novo valor da prestação é de: " + prestacao);
    }
}
