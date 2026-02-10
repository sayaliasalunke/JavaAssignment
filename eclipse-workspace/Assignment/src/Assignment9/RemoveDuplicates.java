package Assignment9;

public class RemoveDuplicates {

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 3, 4, 4, 5};
	        int[] temp = new int[arr.length];
	        int k = 0;

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            for (int j = 0; j < k; j++) {
	                if (arr[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                temp[k++] = arr[i];
	            }
	        }

	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < k; i++) {
	            System.out.print(temp[i] + " ");
	        }
	    }
	}

	

