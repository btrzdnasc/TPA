public class AlgoritmoSomatoria {

    public static void main(String[] args) {
        int i, soma;

        soma = 0;

        for (i = 1; i <= 400; i++) {
            if (i % 5 == 0) {
                soma = soma + i;
            }
        }

        System.out.println("A soma dos múltiplos de 5 do intervalo de 1 até 400 é: " + soma);
    }
}

