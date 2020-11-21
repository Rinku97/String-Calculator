package javaImplementation;

public class StringCalculator2 {
	
	public int Add(String numbers) {
		int result = 0;
		String[] numbersArray = numbers.split(",");
		if(numbersArray.length > 2) {
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
		}else {
			for (String number : numbersArray) {
	        	if (!number.isEmpty()) {
	            	result += Integer.parseInt(number);
	            }    
	        }
		}
        
        return result;
	}
}

