package day1;
import java.util.Scanner;
public class Task2day6 {
	int n[]=new int[5];
	int top=-1;
	public void push()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for a stack:");
		int val=s.nextInt();
		if(top==4)
		{
			System.out.println("Stack Overflow");
		}
		else
			++top;
			n[top]=val;
			System.out.println("element in the stack:");
			display();
	}
	public void display()
	{
		for(int i=0;i<=top;i++) 
		{
		System.out.println(n[i]);
	}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
		}
		else
			System.out.println("element to be popped:"+n[top]);
			top--;
			display();
	}
	public static void main(String[]args) {
		Task2day6 l=new Task2day6();
		Scanner c=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.push operation");
			System.out.println("2.pop operation");
			System.out.println("3.display");
			System.out.println("4.exit");
			System.out.println("Enter your choice:");
			choice=c.nextInt();
			
			switch(choice)
			{
			case 1:
				l.push();
				break;
			case 2:
				l.pop();
				break;
			case 3:
				l.display();
				break;
			case 4:
				System.out.println("Exiting.......");
				break;
			default:
                System.out.println("Invalid choice.");
			}
		}while(choice!=4);
		
	}

}
