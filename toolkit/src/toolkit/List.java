package toolkit;

public class List<TYPE> implements IList<TYPE> {
	private Object [] vet = new Object [10];
	
	public void append(TYPE o) {
		if(count() == vet.length)
			vet = AumVet(vet);
		if(o != null)
			vet[count()] = o;
	}
	
	public TYPE get(int index){
		if (!(0 <= index && index < count()))
			return null;
		return (TYPE) vet[index];
	}
	
	public TYPE first(){
		return get(0);
	}
	
	public TYPE last(){
		return get((count() - 1));
	}
	
	public TYPE drop(int index){
		if (!(0 <= index && index < count()))
			return null;
		Object temp = vet[index];
		delete(index);
		vet = Realoca();
		return (TYPE) temp;
	}
	
	public boolean delete(int index) {
		if (!(0 <= index && index < count()))
			return false;
		vet[index] = null;
		vet = Realoca();
		return true;
	}
	
	public boolean remove(TYPE o) {
		boolean flag = false;
		int cont = 0;
		while(o != vet[cont] && cont < count() - 1) 
			cont++;
		if(o == vet[cont])
			flag = true;
		if(!flag)
			return flag;
		delete(cont);
		return flag;
	}
	
	public void clean() {
		vet = new Object [0];
	}
	
	public int count() {
		int cont = 0;
		for(int i = 0; i < vet.length; i++){
			if(vet[i] != null)
				cont++;
		}
		return cont;
	}
	
	public boolean has(TYPE o){
		for(int i = 0; i < vet.length; i++){
			if(vet[i] == o)
				return true;
		}
		return false;
	}
	
	public boolean empty() {
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] != null)
				return false;
		}
		return true;
	}
		
	private Object [] AumVet(Object [] o) {
		Object [] temp = new Object [o.length * 2];
		for(int i = 0; i < o.length; i++)
			temp[i] = o[i];
		return temp;
	}
	
	private Object [] Realoca(){
		Object [] temp = new Object [vet.length];
		int cont = 0;
		for(int i = 0; i < vet.length; i++){
			if(vet[i] != null){
				temp[cont] = vet[i];
				cont++;
			}
		}
		return temp;
	}
}