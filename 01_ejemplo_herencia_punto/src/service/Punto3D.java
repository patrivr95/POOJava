package service;

public class Punto3D extends Punto {
	
	private int z;

	public Punto3D(int z) {
		super(6, 20);
		this.z = z;
	}
	
	public Punto3D(int x, int y, int z) {
		super(x, y); // el constructor de la super clase siempre tiene que ser la primera instrucción del constructor de la subclase
		this.z= z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
	// sobreescribimos el metodo imprimir() de la clase super, este metodo lo hemos generado haciendo click en boton derecho y generandolo automaticamente
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.print(" y la es z: " + z);
	}
	
	
	
	
	/*@Override
	public void imprimir() {
		super.imprimir(); // llamada al método imprimir() de la clase Punto y asi no hay que llamar a la x y a la y
		System.out.print(" y la es z: " + z);
	}
	*/
	
	
	
}
