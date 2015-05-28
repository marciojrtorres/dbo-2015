package toolkit;

public interface IList<TYPE> {
	
	public void append(TYPE o);
	
	public TYPE get(int index);

	public TYPE first();

	public TYPE last();

	public TYPE drop(int index);

	public boolean delete(int index);

	public boolean remove(TYPE o);

	public void clean();

	public int count();

	public boolean has(TYPE o);

	public boolean empty();
}