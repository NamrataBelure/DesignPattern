package FactoryDesignPattern;

public class Server extends computer{

	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu) {
		super(ram, hdd, cpu);
		
	}

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public String getCpu() {
		return cpu;
	}
	
}
