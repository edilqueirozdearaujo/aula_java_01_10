package aula_01_10;

public class PrincipalBichos {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("Coiote","M","🐺 lobo");
		Leao leao = new Leao("Simba","M","🦁 leão");
		Gato gato = new Gato("Frajola","M","🐱 gato");
		Tigre tigre = new Tigre("Rajah","M","🐯 tigre");
		Cachorro cao = new Cachorro("Scooby","M","🐶 cachorro");
		
		lobo.emitirSom();
		leao.emitirSom();

		tigre.setRaca("🐯 tigre de bengala");
		tigre.emitirSom();

		cao.emitirSom();
		gato.emitirSom();
	}

}
