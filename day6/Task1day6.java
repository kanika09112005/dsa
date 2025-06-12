package day1;

public class Task1day6 {
	int n[]=new int[5];
	int top=-1;
	public void push(int val)
	{
		if (top<n.length-1)
		{
			++top;
			n[top]=val;
		}
		else
			System.out.println("stack overflow");
	}
	public void peek()
	{
		System.out.println("top value:"+n[top]);
	}
	public void display() {
		for(int i=0;i<=top;i++)
		{
			System.out.println(n[i]);
		}
	}
	public void pop() {
		if(top==-1) 
		{
			System.out.println("Stack underflow");
		}
		else
			System.out.println("Popped out:"+n[top]);
			top--;
	}
	public static void main(String[]args) {
		Task1day6 l=new Task1day6();
		l.push(1);
		l.push(2);
		l.push(3);
		l.display();
		l.peek();
		l.pop();
		l.display();
	}

}
