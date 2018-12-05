package BuilderDesignPattern;

public class shop {
 
	public static void main(String[] args) {
	
		/*Phone p=new Phone("Android",2,"qualcomm",5.5,3100);
		System.out.println(p);*/
		
		Phone p=new PhoneBuilder().setOs("Android").setBattery(3100).getphone();
		System.out.println(p);
    }
}
