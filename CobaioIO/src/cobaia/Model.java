package cobaia;
// classe genérica (abstrata)
// classe abstrata: server como pai para outras
public abstract class Model {
	// PROTECTED: torna o id acessível para
	// as classes filhas
	protected int id;
	
	// métodos concretos (com miolo)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// métodos abstratos
	public abstract String toCSV();
	
	public abstract void fromCSV(String row);
	
	
	
	
	
	
	
	

}
