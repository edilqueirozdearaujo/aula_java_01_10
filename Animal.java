package aula_01_10;

public abstract class Animal {
	private String nome;
	private String sexo;
	private String raca;
	
	public Animal(String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}

	public String getNome() {
		return this.nome;
	}
	public String getSexo() {
		return this.sexo;
	}
	public String getRaca() {
		return this.raca;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public abstract void dormir();	
	public abstract void caminhar();
	public abstract void correr();
	public abstract void emitirSom();
}
