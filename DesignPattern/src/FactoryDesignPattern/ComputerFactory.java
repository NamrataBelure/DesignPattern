package FactoryDesignPattern;

public class ComputerFactory {

	public enum ComputerType{
		PC,
		SERVER
		}
	
	
	public static computer getComputer(String hdd,String ram,String cpu,ComputerType type){
		
		computer comp=null;
		
		if (ComputerType.PC.toString().equals(type.toString())) {
			return new Pc(ram, hdd, cpu);
		}
		else if (ComputerType.SERVER.toString().equals(type.toString())) {
			return new Server(ram, hdd, cpu);
		}
		return comp;
	
		
	}
	
}
