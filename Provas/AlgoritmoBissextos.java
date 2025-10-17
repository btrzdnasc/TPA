import java.util.Scanner;

public class AlgoritmoBissextos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anoInicial, anoFinal, anos, anosBissextos;

        anos = 0;
        anosBissextos = 0;

        System.out.print("Digite o ano inicial: ");
        anoInicial = ler.nextInt();

        System.out.print("Digite o ano final: ");
        anoFinal = ler.nextInt();

        System.out.println("\nOs anos bissextos são:");

        while (anoInicial < anoFinal) {
            if (anoInicial % 4 == 0) {
                anosBissextos = anoInicial;
                System.out.println(anosBissextos);
            }

            anos++;
            anoInicial++;
        }

        System.out.println("O total de anos dentro do intervalo é de: " + anos);

        ler.close();
    }
}

