package oo4;

public class Poupanca extends Conta {
	
	public Poupanca(Cliente cliente, int agencia, int numero, double saldo) {
		super(cliente, agencia, numero, saldo);		
	}

	public void aplicaRendimento() {
		saldo *= 1.005;
	}

}
