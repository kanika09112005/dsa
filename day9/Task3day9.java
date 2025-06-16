package day1;
import java.util.Scanner;
import java.util.Arrays;

public class Task3day9 {
	public static void main(String[]args) {
	int a[]= {2,3,4,4,4,6,7,9};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the target element:");
	int target=s.nextInt();
	int left=0;
	int right=a.length;
	while(left<right) {
	int mid=(left+right)/2;
	if(a[mid]<target) {
		left=mid+1;
	}
	else
		right=mid;
		
	}int lowerbound=left;
	
	 left=0;
	 right=a.length;
	while(left<right) {
		int mid=(left+right)/2;
		if(a[mid]<=target) {
			left=mid+1;
		}
		else
			right=mid;
			
		}int upperbound=left;
		
		int count=upperbound-lowerbound;
		System.out.println("count of "+target+"is"+count);
	}
}
