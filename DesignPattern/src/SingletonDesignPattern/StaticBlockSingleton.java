package SingletonDesignPattern;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	public StaticBlockSingleton() {
		super();
	}
	static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
	 public static StaticBlockSingleton getInstance(){
	        return instance;
	    }
	
}
