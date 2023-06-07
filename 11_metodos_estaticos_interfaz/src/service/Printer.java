package service;

public interface Printer {
	void print(String msg);
	/*static Printer of() {
		//generar una implementación por defecto de la interfaz
		//que consista en imprimir por pantalla el mensaje enviado a print
		return new MyClass();
	}*/
	
	//versión con clase anónima
	static Printer of() {
		//generar una implementación por defecto de la interfaz
		//que consista en imprimir por pantalla el mensaje enviado a print
		return new Printer() {
			
			@Override
			public void print(String msg) {
				System.out.println(msg);
				
			}
		};
	}
}

/*class MyClass implements Printer{

	@Override
	public void print(String msg) {
		System.out.println(msg);
		
	}
	
}*/
