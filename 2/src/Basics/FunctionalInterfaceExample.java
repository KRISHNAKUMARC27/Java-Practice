package Basics;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//@FunctionalInterface  if it has only 1 abstract method, java implicitly assumes it as functional inteface
interface Calculator {

	int operate(int a, int b);

}

public class FunctionalInterfaceExample {

	public static void main(String args[]) {
		Calculator addition = (a, b) -> a + b;
		Calculator multiply = (a, b) -> a * b;
		System.out.println(addition.operate(2, 2));
		System.out.println(multiply.operate(2, 2));

		List<Integer> numList = List.of(1, 2, 3, 4, 5);
		Predicate<Integer> isEven = num -> num % 2 == 0;
		List<Integer> evenList = numList.stream().filter(isEven).collect(Collectors.toList());
		System.out.println(evenList);

		Consumer<Integer> consumer = num -> {
			System.out.println(num);
		};

		numList.forEach(consumer);

		Function<Integer, Integer> sum = (a) -> {
			return a = a+a;
		};
		System.out.println(sum.apply(10));
		
		BiFunction<Integer, Integer, String> stringsum = (a,b) -> {
			Integer c = a+b;
			return c.toString();
		};
		
		System.out.println(stringsum.apply(5, 10));
	}
}
