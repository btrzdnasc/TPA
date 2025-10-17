import java.util.Scanner;

public class AlgoritmoFaixaEtaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade,i;
		int f1,f2,f3,f4,f5;
		double porc1,porc2,porc3,porc4,porc5;
		
		f1 = 0;
		f2 = 0;
		f3 = 0;
		f4 = 0;
		f5 = 0;
		i = 1;
		
		while(i<=10) {
			System.out.println("Digite a idade da pessoa " + i + " :");
			idade = ler.nextInt();
			
			if (idade <= 15) {
				f1 = f1 + 1;
			} else if (idade<= 30) {
				f2 = f2 + 1;
			} else if (idade <= 45) {
				f3 = f3 + 1;
			} else if (idade <= 60) {
				f4 = f4 + 1;
			} else {
				f5 = f5 + 1;
			}
			
		i++;
			
		}
		
		porc1 = (f1*100)/10;
		porc2 = (f2*100)/10;
		porc3 = (f3*100)/10;
		porc4 = (f4*100)/10;
		porc5 = (f5*100)/10;
		
		System.out.println("Faixa 1 (até 15 anos): " + f1 + " pessoas - " + porc1 + "%");
		System.out.println("Faixa 2 (até 30 anos): " + f2 + " pessoas - " + porc2 + "%");
		System.out.println("Faixa 3 (até 45 anos): " + f3 + " pessoas - " + porc3 + "%");
		System.out.println("Faixa 4 (até 60 anos): " + f4 + " pessoas - " + porc4+ "%");
		System.out.println("Faixa 5 (mais de 60 anos): " + f5 + " pessoas - " + porc5 + "%");
		
		ler.close();
		
	}

}
