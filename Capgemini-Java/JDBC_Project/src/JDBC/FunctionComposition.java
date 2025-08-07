package JDBC;

import java.util.function.Function;

public class FunctionComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello";

        Function<String, String> toUpper = str -> str.toUpperCase();

        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();

        Function<String, String> appendLength = str -> str + " (" + input.length() + ")";

        Function<String, String> composedFunction = toUpper
                                                    .andThen(reverse)
                                                    .andThen(appendLength);

        String result = composedFunction.apply(input);
        System.out.println("Result: " + result);

	}

}
