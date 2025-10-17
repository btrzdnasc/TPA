import java.util.Scanner;

public class algoritmoKm {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double distanciaKm,combustivelLitro,gastoMedio;
		
		System.out.println("Informe a distância percorrida em Km: ");
		distanciaKm = ler.nextDouble();
		 
		System.out.println("Informe a capacidade de combustível: ");
		combustivelLitro = ler.nextDouble();
		
		gastoMedio = distanciaKm/combustivelLitro;
		
		System.out.println("O gasto médio é de: " + gastoMedio);

        if(gastoMedio >= 10) {
    		System.out.println("Econômico");
        } else {
    		System.out.println("Não econômico");
        }

        ler.close();
        
	}

}
