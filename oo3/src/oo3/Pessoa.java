package oo3;

public class Pessoa {
	
	public void casaCom(Pessoa outraPessoa) {
		if (this.conjuge == null) {
			this.conjuge = outraPessoa;
			outraPessoa.casaCom(this);
		}
		
	}
	
	private String nome;
	
	private Pessoa conjuge;
	// coleção add, remove, getIndex
	private Pessoa[] dependentes = new Pessoa[5];
	
	public void addDependente(Pessoa p) {
		for (int i = 0; i < dependentes.length; i++) {
			if (dependentes[i] == null) {
				dependentes[i] = p;
				break;
			}
		}
	}
	
	public void removeDependente(Pessoa p) {
		
	}
	// ["a,"b", null, null, "c"]
	public Pessoa[] getDependentes() {
		int tam = 0;
		for (int i = 0; i < dependentes.length; i++) {
			if (dependentes[i] != null) tam++;
		}		
		Pessoa[] novo = new Pessoa[tam];
		for (int i = 0, j = 0; i < dependentes.length; i++) {
			if (dependentes[i] != null) {
				novo[j++] = dependentes[i];
			}			
		}
		return novo;
	}
	
	
	
	// generate getters/setters, constructor
	// hashCode and equals, toString

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome;
	}

	public Pessoa getConjuge() {
		return conjuge;
	}


	
}