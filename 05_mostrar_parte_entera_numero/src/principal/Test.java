package principal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarParteEntera(8.93);
		mostrarParteEntera(7990L);
	}
	
	static void mostrarParteEntera(Number num) {
		System.out.println("El valor entero es: "+num.intValue());
	}

}
