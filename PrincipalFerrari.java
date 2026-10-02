package aula_01_10;

public class PrincipalFerrari {

	public static void main(String[] args) {
		Ferrari ferrariVermelha = new Ferrari(); 
		Ferrari ferrariAmarela = new Ferrari();
		
		System.out.println("***************************");
		ferrariVermelha.ligar();
		ferrariVermelha.engatar();
		ferrariVermelha.acelerar();
		ferrariVermelha.frear();
		ferrariVermelha.manobrar();
		ferrariVermelha.desligar();
		
		System.out.println("***************************");		
		ferrariAmarela.ligar();
		ferrariAmarela.engatar();
		ferrariAmarela.acelerar();
		ferrariAmarela.frear();
		ferrariAmarela.manobrar();
		ferrariAmarela.desligar();
	}

}
