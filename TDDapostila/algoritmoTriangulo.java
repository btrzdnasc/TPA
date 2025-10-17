import java.util.Scanner;

public class algoritmoTriangulo {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 
		 double ladoA,ladoB,ladoC;

	        System.out.print("Digite o lado A: ");
	        ladoA = ler.nextDouble();
	        
	        System.out.print("Digite o lado B: ");
	        ladoB = ler.nextDouble();
	        
	        System.out.print("Digite o lado C: ");
	        ladoC = ler.nextDouble();

	        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {

	            if (ladoA == ladoB && ladoB == ladoC) {
	                System.out.println("Triângulo Equilátero");
	            } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
	                System.out.println("Triângulo Escaleno");
	            } else {
	                System.out.println("Triângulo Isósceles");
	            }
	        } else {
	            System.out.println("Os valores não formam um triângulo.");
	        }

	        ler.close();
	    }
	}