import java.util.Scanner;

public class AlgoritmoIdadeUsuario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anoAtual, anoNascimento, idade, i;

        do {
            System.out.print("Digite o ano de nascimento: ");
            anoNascimento = ler.nextInt();

            System.out.print("Digite o ano atual: ");
            anoAtual = ler.nextInt();

            idade = anoAtual - anoNascimento;

            System.out.println("A idade é: " + idade);

            System.out.print("Deseja continuar? 1 – Continuar / 0 - Sair: ");
            i = ler.nextInt();

        } while (i == 1);

        ler.close();
    }
}

