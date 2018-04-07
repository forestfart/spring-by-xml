package main;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
	private IPrinter printer;
	
	public void setPrinter(IPrinter iprinter) {
		this.printer = iprinter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		printer.greet();
		System.out.print(name);
	}
}