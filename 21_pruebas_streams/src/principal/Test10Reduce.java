package principal;

import java.util.List;

public class Test10Reduce {

	public static void main(String[] args) {
		List<Integer> nums = List.of(3, 8, 1, 3, 4);
		nums.stream()
		.reduce((a, b) -> a * b)
		.orElse(0);

	}

}
