package FactoryDesignPattern;

public abstract class computer {
	
	public  String RAM;
	public  String HDD;
	public  String CPU;
	@Override
	public String toString() {
		return "computer [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String ram) {
		RAM =ram;
	}
	public String getHDD() {
		return HDD;
	}
	public void setHDD(String hdd) {
		HDD = hdd;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cpu) {
		CPU = cpu;
	}
	
	public computer(String ram, String hdd, String cpu) {
		super();
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
	

	
	
}
