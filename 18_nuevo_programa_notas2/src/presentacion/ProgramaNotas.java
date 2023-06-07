package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import service.NotasService;

public class ProgramaNotas {

	public static void main(String[] args) {
        NotasService notas = new NotasService();
        Scanner sc = new Scanner(System.in);
        int opc;
        double nota;
        //Mostrar menu por pantalla.
        do {
            System.out.println("1. Grabar nota");            
            System.out.println("2. Eliminar suspensos");            
            System.out.println("3. Subir notas");           
            System.out.println("4. Mostrar todas"); 
            System.out.println("5. Salir"); 
            opc = sc.nextInt();
            switch(opc) {
	            case 1: System.out.println("Escriba la nota que quiere agregar");
	                    nota = sc.nextDouble();
	                    notas.guardarNota(nota);
	                    break;
	            case 2: notas.eliminarSuspensos();
	                    break;
	            case 3: 
	                    notas.subirNotas();
	                    break;	            
	            case 4:	            		
	            		notas.obtenerNotas().forEach(n->System.out.println(n));
	            case 5:
	            	System.out.println("Adios!");
            }
        }while(opc>=1&&opc<=4);
        
        
    }

}
