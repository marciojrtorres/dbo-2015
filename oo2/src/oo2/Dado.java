package oo2;

/** (/** é para documentar a API)
 * 
 * Representa um Dado regular de 6 faces com
 * 6 numeros de 1 a 6.
 * 
 * @author Marcio Torres
 */
public class Dado {

	// Dado TEM UM valor
	private int valor = 1;
	
	// Dado TEM UM IRandom
	private IRandom randomizer;
	
	// DADO TEM UMA DEPENDENCIA!
	public Dado(IRandom r) {
		this.randomizer = r;
	}
	
	/**
	 * joga o dado eventualmente mudando seu valor
	 */
	public void joga() {
		randomizer.next();
		valor = (int) (randomizer.get() * 6 + 1);
	}

	/**
	 * obtem o valor da face superior do dado
	 * 
	 * @return o valor de 1 a 6 presente na face superior
	 */
	public int getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return valor + "";
	}
	
	// NAO EH API PQ EH PRIVADO!
	private void randomizarDado() {
		// magica
	}
}










