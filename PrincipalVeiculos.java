package aula_01_10;

public class PrincipalVeiculos {

	public static void main(String[] args) {
		Onibus amarelinho = new Onibus("ABC-8899","XB1","amarelo",2020);
		Carro ferrari = new Carro("XXX-0007","F1","vermelha",2020);
		
		amarelinho.ligar();
		amarelinho.acelerar();
		amarelinho.virar();
		amarelinho.frear();
		
		System.out.println("-------------------------");
		
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
	}

}
