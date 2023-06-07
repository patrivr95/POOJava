package principal;

interface Prueba{
	int process(String m);
}

public class Test {

	public static void main(String[] args) {
		//Utilizando expresiones lambda, crear un objeto que implemente la interfaz anterior
		//la implementación consistirá en devolver el número de caracteres de la cadena
		Prueba pr=m->m.length();
		Prueba pr2=(String m)->{return m.length();};
		
		//usamos el objeto para mostrar los caracteres de una cadena
		System.out.println(pr.process("hola"));
	}

}
