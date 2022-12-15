package main.java.com.utils;

public class Utils {

	public boolean isPrime(int number) {
		// Corner case
        if (number <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        } 
  
        return true;
		
	}
	
	
	public int sumEvenNumbers(int a, int b) {
		int sum=0;
		if(a % 2 == 0) {
			sum +=a;	
		}
		
		if(b % 2 == 0) {
			sum +=b;	
		}
		
		return sum;
		
	}
	
	
	public int countLetterOccurence(String string, char letter) {
		int count = 0;
		int fromIndex = 0;
		while(string.indexOf(letter, fromIndex) != -1) {
			count ++;
			fromIndex = string.indexOf(letter, fromIndex)+1;
		}
		return count;
	}
	
}
