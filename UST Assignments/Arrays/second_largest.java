package Arrays;

public class second_largest {

	public static void main(String[] args) {
		int n=5,result;
		int[] arr = {87,34,56,23,97,21};
		result  = findSecondLargest(arr,n);
		System.out.println(result);
	}
	public static int findSecondLargest(int[] arr, int n) {
		int i, second;

        int largest = second = Integer.MIN_VALUE;

        // Find the largest element
        for (i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Find the second largest element
        for (i = 0; i < n; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        
		return second;
	}

}
