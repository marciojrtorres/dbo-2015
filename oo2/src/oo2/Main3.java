package oo2;

public class Main3 {
	public static void main(String[] args) {
		
		IRandom fakeRandom = new PiorRandomPossivel();
		//IRandom trueRandom = new TrueRandom();
		
		Dado d = new Dado(fakeRandom);
		// API:
		// APPLICATION PROGRAMMING INTERFACE
		// Interface de Programação da Aplicação
		// Em outras palavras, classes e métodos (PÚBLICOS)!
		
		// API (interface) estabelece um CONTRATO
		d.joga();
		int v = d.getValor();
		// Dado, por exemplo, tem dois métodos na sua API
		// joga: muda (ou não) o valor
		// getValor: retorna o valor do dado
		
		System.out.println(v); // 1,2,3,4,5,6		
		

	}
}
