import java.util.Scanner;
public class salarioLiquido {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        
        double valorHora, numeroAulas, inss, salarioBruto, desconto, salarioLiquido;

        System.out.println("Digite o valor por horas de cada aula: ");
        valorHora = ler.nextDouble();

        System.out.println("Digite o número de aulas dadas no mês: ");
        numeroAulas = ler.nextDouble();

        System.out.println("Digite o percentual de desconto do inss: ");
        inss = ler.nextDouble();

        salarioBruto = valorHora * numeroAulas;
        desconto = salarioBruto * (inss / 100);
        salarioLiquido = salarioBruto - desconto;

        System.out.println("O seu salário bruto é de: " + salarioBruto);
        System.out.println("O seu salário líquido é de: " + salarioLiquido);
    }
}
