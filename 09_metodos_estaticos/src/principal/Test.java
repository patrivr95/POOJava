package principal;

import service.Calculadora;

public class Test {

	public static void main(String[] args) {
		//calcular factorial de un número
		Calculadora.factorial(5);
		//suma y multiplicar dos números
		Calculadora cal=new Calculadora(5, 8);
		cal.suma();
		cal.multiplica();
		Calculadora.aleatorio();
		cal.aleatorio();
		

	}

}
