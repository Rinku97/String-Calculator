package javaImplementation;

public class StringCalculator4 {
	
	public static int Add(String numbers) {
		String delimiter = ",|\n";
		String WithoutDelimiter = numbers;
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("//") + 2;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			WithoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1);	
		}
		return Add(WithoutDelimiter, delimiter);
	}
	
	private static int Add(final String numbers, final String delimiter) {
		int result = 0;
		String[] numbersArray = numbers.split(delimiter);
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				result += Integer.parseInt(number.trim());
			}
		}
		return result;		
	}

}
