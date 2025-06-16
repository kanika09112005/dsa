package day1;
import java.util.Arrays;
import java.util.Scanner;
public class Task2Day7 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int num=s.nextInt();
		System.out.println("Enter the elements:");
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			
		}
	}

}
