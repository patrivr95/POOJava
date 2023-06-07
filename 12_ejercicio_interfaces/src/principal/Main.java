package principal;

import java.util.List;
import java.util.Set;

import service.NumerosService;
import service.Operaciones;

public class Main {

	public static void main(String[] args) {
		//creamos lista cualquiera de números
		List<Integer> lista=List.of(8,3,2,6,31);
		//instancia de NumerosService
		NumerosService numsServ=new NumerosService();
		//una implementación de la interfaz Operaciones
		//para cálculo de factorial
		Operaciones oper=new Operaciones() {		
			@Override
			public int procesar(int num) {
				int res=1;
				for(int i=2;i<=num;i++) {
					res*=i;
				}
				return res;
			}
		};
		
		Set<Integer> resultado=numsServ.tranformar(lista, oper);
		for(Integer in:resultado) {
			System.out.println(in);
		}

		
		
	}

}
