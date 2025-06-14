package day1;
import java.util.Arrays;
import java.util.Scanner;
public class Task1Day8 {
	public static void main(String[]args) {
		int a[]={23,45,46,89,34};
		System.out.println(Arrays.toString(a));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to  find:");
		int find=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==find){
				System.out.println(i);
				flag=true;
				break;
		}
		}if(!flag) { 
				System.out.println("Value not found");
		}
		}
	}
