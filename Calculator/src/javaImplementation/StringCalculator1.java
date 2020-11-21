package javaImplementation;

public class StringCalculator1 {
	
	public int Add(String numbers) {
		int result = 0;
		String[] numbersArray = numbers.split(",");
        for (String number : numbersArray) {
        	if (!number.isEmpty()) {
            	result += Integer.parseInt(number);
            }    
        }
        return result;
	}
}