package Assignment9;

public class EvenOddCount {

	
	    
	    public static void main(String[] args) {
	        int[] arr = {10, 21, 32, 43, 54};
	        int even = 0, odd = 0;

	        for (int num : arr) {
	            if (num % 2 == 0)
	                even++;
	            else
	                odd++;
	        }

	        System.out.println("Even count: " + even);
	        System.out.println("Odd count: " + odd);
	    }
	}

	

