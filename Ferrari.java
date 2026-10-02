package aula_01_10;

public class Ferrari implements Veiculo{
	@Override
	public void ligar() {
		System.out.println("Veículo ligado!");
	}
	@Override
	public void desligar() {
		System.out.println("Veículo desligado.");
	}
	@Override
	public void manobrar() {
		System.out.println("Fazendo manobra...");
	}
	@Override
	public void engatar() {
		System.out.println("Engatou marcha.");
	}
	@Override
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	@Override
	public void frear() {
		System.out.println("Freando...");
	}
	

}
