package day1;

public class postAssessmentday9 {
	
	    public static int lowerBound(int[] arr, int target) {
	        int lo = 0, hi = arr.length;
	        while (lo < hi) {
	            int mid = lo + (hi - lo) / 2;
	            if (arr[mid] >= target) hi = mid;
	            else lo = mid + 1;
	        }
	        return lo;
	    }

	    public static int upperBound(int[] arr, int target) {
	        int lo = 0, hi = arr.length;
	        while (lo < hi) {
	            int mid = lo + (hi - lo) / 2;
	            if (arr[mid] > target) hi = mid;
	            else lo = mid + 1;
	        }
	        return lo;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 3, 7, 10, 11, 11, 25};
	        int target = 11;
	        System.out.println("Lower Bound: " + lowerBound(arr, target));
	        System.out.println("Upper Bound: " + upperBound(arr, target));
	    }
	}



