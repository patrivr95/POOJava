package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class TratamientoColecciones {

	//realizar un método que devuelva una lista con todos los nombres
	//almacenados en un fichero, cuya dirección se recibe como parámetro
	public List<String> listaNombre(String dir){
		List<String> lista=new ArrayList<>();
		//recuperamos los textos y los guardamos en el arraylist
		lista.add("texto");
		 try(BufferedReader bf = new BufferedReader(new FileReader(dir))) {
	            while(bf.readLine()!=null) {
	                lista.add(bf.readLine());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		return lista;
	}
	
	//realizar un método que reciba una lista de números enteros y
	//devuelva la suma de los mismos
	public int sumaNumeros(List<Integer> nums) {
		int suma=0;
		for(int n:nums) {
			suma+=n;
		}
		return suma;
	}
	
	//realizar un método que reciba un conjunto de cadenas de caracteres
	//y un número. Dicho método, devolverá una lista con todas las cadenas
	//cuya cantidad de caracteres sea inferior al número recibido
	
	public List<String> cadenasCortas(Set<String> cadenas, int max){
		List<String> resultado=new ArrayList<>();
		for(String s:cadenas) {
			if(s.length()<max) {
				resultado.add(s);
			}
		}
		return resultado;
	}
	
	//realizar un nuevo método método, que reciba dos colecciones de números enteros
	//y nos diga cuantos números se encuentran en ambas colecciones
	public int repetidos(Collection<Integer> col1, Collection<Integer> col2) {
		int rep=0;
		for(Integer n:col1) {
			if(col2.contains(n)) {
				rep++;
			}
		}
		return rep;
	}
	
	
	
}
