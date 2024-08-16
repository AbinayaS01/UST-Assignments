package Arrays;

public class frequency {

	public static void main(String[] args) {
	       int[] arr = {3,4,5,2,3,4,6,7,8,5,3,6,7,8,3 };
	      int n = arr.length;
	      int max_count = 0;
	      int maxfreq = 0;
	       
	      //Logic implementation
	      for (int i = 0; i < n; i++){
	         int count = 0;
	         for (int j = 0; j < n; j++){
	            if (arr[i] == arr[j]){
	               count++;
	            }
	         }
	        
	         if (count > max_count){
	            max_count = count;
	            maxfreq = arr[i];
	         }
	      }
	      //print the result
	      System.out.print("Most frequent element is: " + maxfreq);

	}

}
