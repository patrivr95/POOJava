package principal;

import java.util.Scanner;



public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduzca el saldo inicial: ");
		double saldoInicial = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el límite: ");
		double limite = Double.parseDouble(sc.nextLine());
		
		int opcion;
		
		do {
			System.out.println("Escoge una opción: ");
			opcion = Integer.parseInt(sc.nextLine());
			mostrarMenu();
			switch (opcion):
				case 1:
					
					
			
			
		} while (opcion != 4);
		
		

	}
	
	public static void mostrarMenu() {
		System.out.println("1. Ingresar");
		System.out.println("2. Extraer");
		System.out.println("3. Ver saldo y movimientos");
		System.out.println("4. Salir");
	}

}
