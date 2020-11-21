package javaImplementation;

public class StringCalculator3 {
	public int Add(String numbers) {
		int result = 0;
		String[] numbersArray = numbers.split(",|\n");
		//Handling unknown amount of values need to be removed or need to be commented for execution of 3rd step.
		for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            result += Integer.parseInt(number.trim());
	        }    
	    }
		
        
        return result;
	}

}
