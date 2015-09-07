package cobaia;

// Engenheiros de Software
// Arquitetos de Sistema
// Engenheiros da Computação
// Analistas de Sistema

// tradeoff (escolher prós/contras)

public class Professor extends Model {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toCSV() {
		StringBuilder builder = new StringBuilder();
		builder.append(id).append(";").append(nome);
		return builder.toString();
	}

	@Override
	public void fromCSV(String row) {
		// TODO Auto-generated method stub
		
	}


	
	
}
