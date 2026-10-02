package aula_01_10;

public class PrincipalBichos {

	public static void main(String[] args) {
		Lobo geraldo = new Lobo();
		Gato ravena = new Gato();
		
		
		geraldo.dormir();
		geraldo.caminhar();
		geraldo.correr();
		geraldo.emitirSom();
		
		System.out.println("***************************");
		
		ravena.caminhar();
		ravena.correr();
		ravena.emitirSom();
		ravena.dormir();
		
	}

}
