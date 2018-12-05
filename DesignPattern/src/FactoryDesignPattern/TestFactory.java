package FactoryDesignPattern;

import FactoryDesignPattern.ComputerFactory.ComputerType;

public class TestFactory {

	public static void main(String[] args) {
computer pc=ComputerFactory.getComputer("2 GB","500 GB","2.4 GHz",ComputerType.PC);
computer server=ComputerFactory.getComputer("16 GB","1 TB","2.9GHz",ComputerType.SERVER);
	
	    System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	
	}
}
