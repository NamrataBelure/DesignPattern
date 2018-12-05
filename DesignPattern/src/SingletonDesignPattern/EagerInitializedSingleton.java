package SingletonDesignPattern;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance= new EagerInitializedSingleton();

	public EagerInitializedSingleton() {
		super();
	}
	
	 public static EagerInitializedSingleton getInstance(){
	        return instance;
	    }
	
}
