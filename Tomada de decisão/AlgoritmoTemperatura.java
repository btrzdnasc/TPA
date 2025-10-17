package projectsFacilimos;
  import java.util.Scanner;
public class AlgoritmoTemperatura {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double fahrenheit, celsius;
		
		System.out.println("Escreva a temperatura em graus fahrenheit: ");
		fahrenheit = ler.nextInt();
		
		
		celsius = (fahrenheit - 32)*5/9;
		
		
		System.out.println("A sua temperatura em graus celsius é: "+celsius);
			
		
		
		if (celsius < 0) {
		
		     System.out.println("Frio extremo");
	
	  } else if (celsius <=10) {
		
		     System.out.println("Frio");
		     
	  
      } else if (celsius <=20) {
		
		     System.out.println("Frio moderado");
		    		 

	  } else if (celsius <=24) {
		
		     System.out.println("Clima ameno");
		      
	  
	  } else {
		 
		    System.out.println("Calor");
	  }
	
	}

	
}
