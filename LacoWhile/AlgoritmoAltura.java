
public class AlgoritmoAltura {

	public static void main(String[] args) {
		
		double alturaJoao,alturaPedro;
		int anos;
		
		alturaJoao = 1.34;
		alturaPedro = 1.45;
		anos = 0;
		
		while (alturaJoao<=alturaPedro) {
			
			alturaJoao = alturaJoao + 0.025;
			alturaPedro = alturaPedro + 0.020;
			anos = anos + 1;
			
		}
		
		System.out.println("João ficará mais alto que Pedro em " + anos + " anos");

	}

}
