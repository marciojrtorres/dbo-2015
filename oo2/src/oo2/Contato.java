package oo2;

public class Contato {

	private String nome;
	
	// vetor (array) é uma estrutura de dados de tamanho fixo e arbitrário
	// precisamos de uma estrutura de dados de tamanho variável!
	private Telefone[] telefones = new Telefone[3];
	
	// coleções: addItem
	public void addTelefone(Telefone t) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = t;
				break;
			}
		}
	}
	
	public Telefone getTelefone(int index) {
		// programação defensiva
		if (index >= 0 && index < telefones.length) {
			return telefones[index];
		}
		return null;
	}
	
	public void removeTelefone(int i) {
		if (i >= 0 && i < telefones.length) {
			telefones[i] = null;
		}
	}

	
	public Contato(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}	
}