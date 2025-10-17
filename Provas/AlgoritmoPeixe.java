import java.util.Scanner;

public class AlgoritmoPeixe {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double peixe;

        System.out.print("Digite o peso do peixe (em kg): ");
        peixe = ler.nextDouble();

        if (peixe > 10) {
            System.out.println("O valor do quilograma é de R$20,00 e terá uma taxa adicional de R$30,00");
        } else if (peixe >= 5 && peixe < 10) {
            System.out.println("O valor do quilograma é de R$23,00");
        } else if (peixe >= 3 && peixe < 5) {
            System.out.println("O valor do quilograma é de R$24,00");
        } else {
            System.out.println("O valor do quilograma é de R$25,00");
        }

        ler.close();
    }
}
