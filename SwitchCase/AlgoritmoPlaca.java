import java.util.Scanner;

public class AlgoritmoPlaca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int placa;
		System.out.println("Informe o último dígito de sua placa para saber o dia do seu rodízio: ");
		placa = ler.nextInt();
		
		switch(placa) {
		    case 1 :
		    case 2 :
		    	System.out.println("Segunda-feira");
		    	break;
		       case 3:
		       case 4:
		    	   System.out.println("Terça-feira");
		    	   break;
		           case 5 :
		           case 6 :
		        	   System.out.println("Quarta-feira");
		        	   break;
		               case 7 :
		               case 8 :
		            	   System.out.println("Quinta-feira");
		            	   break;
		                   case 9 :
		                   case 0 :
		                	   System.out.println("Sexta-feira");
		                	   break;
		                	   default:
		                	   System.out.println("Número inválido");
		                	   
		
		
		}
		
		ler.close();
        
	}

}