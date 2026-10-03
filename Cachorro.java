package aula_01_10;

public class Cachorro extends Animal{
	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void dormir() {
		System.out.println("O " + getRaca() + " dormiu!");
	}
	@Override
	public void caminhar() {
		System.out.println("O " + getRaca() + " está caminhando!");
	}
	@Override
	public void correr() {
		System.out.println("O " + getRaca() + " está correndo!");
	}
	@Override
	public void emitirSom() {
		System.out.println("O " + getRaca() + " está latindo!");
	}
}
