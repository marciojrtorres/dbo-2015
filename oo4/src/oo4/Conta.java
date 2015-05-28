package oo4;

public class Conta {
	
	private Cliente cliente;
	private int agencia;
	private int numero;
	// visível para os filhos (subtipos, subclasses)
	protected double saldo;
	
	public Conta(Cliente cliente, int agencia, int numero, double saldo) {
		super();
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void saque(double valor) {
		if (valor <= saldo) saldo -= valor;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numero;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", agencia=" + agencia
				+ ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	

}
