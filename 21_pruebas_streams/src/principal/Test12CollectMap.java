package principal;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test12CollectMap {

	public static void main(String[] args) {
		String empleados = "1111-Ana, 2222-Marcos, 3333-Lucas, 4444-Andres";
		
		// tabla con todos los empleados (clave dni, valor nombre) cuyos nombres tengan una longitud inferior a 6
		
		String[] todos = empleados.split(",");
		Map<String, String> tabla=
				Arrays.stream(todos)
				.filter(e->e.split("-")[1].length() < 6) // Stream<String>
				.collect(Collectors.toMap(e->e.split("-")[0], e->e.split("-")[1],
						(a,b) -> a+b));
		tabla.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
