package principal;

import java.util.Arrays;
import java.util.List;

public class Test8FlatMap {

	public static void main(String[] args) {
		List<Double[]> notas = List.of(new Double[]{8.3,4.5,2.9,9.5,7.0},
                new Double[]{7.5,4.5,6.0},
                new Double[]{6.3,3.3,9.5,4.8});
		
		//¿Cuantos aprobados hay?
		notas.stream() //Stream<double[]>
		.flatMap(a->Arrays.stream(a)) //Stream<double>
		.filter(n->n>=5.0)
		.count();

	}

}
