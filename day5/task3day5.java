package day1;

public class task3day5 {
	Node last;
	class Node
	{
	 int data;
	 Node next;
	
	 Node(int val)
	 {
		 data=val;
	 }
	}
	public void  display() {
		Node temp = last.next; 
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }
	public void insertAtBegin(int val)
	{
		Node newNode =new  Node(val);
		if(last==null)
		{
			last=newNode;
			last.next = last;
		}
		else
		{
			newNode.next=last.next;
			last.next=newNode;
			newNode =last;}
	}
	public void deleteAtHead() {
		Node head=last.next;
		if(last==head) {
			last=null;
		}
		else {
			last.next=head.next;
		}
		System.out.println("Deleted node: " + head.data);
	}	
	public static void main(String args[]) {
		 task3day5 l=new  task3day5();
		 l.insertAtBegin(60);
		 l.insertAtBegin(50);
		 l.insertAtBegin(40);
		 l.display();
		 System.out.println("After deletion");
		 l.deleteAtHead();
	     l.display();
			

}
}


