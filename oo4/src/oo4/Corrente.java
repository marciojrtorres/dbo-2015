package oo4;

public class Corrente extends Conta {
	
	public Corrente(Cliente cliente, int agencia, int numero, double saldo) {
		super(cliente, agencia, numero, saldo);
	}

	public void aplicaTarifa() {
		saldo -= 15;
	}	
}