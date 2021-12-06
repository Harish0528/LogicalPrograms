package SortingAlgorithm;

class ObjectCreationException extends Exception{
	public ObjectCreationException(String string) {
		super(string);
	}
}

public class SingletonObject {
	
	static SingletonObject bs;
	
	private SingletonObject() throws ObjectCreationException {
	
	if(bs!=null) {
		throw new ObjectCreationException("Object OverFlow Exception");
	}
	}
	static {
	
		if(bs==null) {
		try {	
		 bs=new SingletonObject();
		}
		catch (ObjectCreationException e) {
			System.out.println(e);
		}
		}
		
	}
	public void a() {
		System.out.println("a method");
	}

	public static void main(String args[]) {
		
	
//		bs=new BubbleSort();
		bs.a();
		
//		new BubbleSort();
		
	}
}
