package compareeeeeeLinkedList;

import compareeeeeeLinkedList.compareeee.Node;

public class comapreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareeee r=new compareeee();
		Node head;
		Node temp;
		head=r.insert("a");
		head.next=r.insert("b");
		head.next.next=r.insert("c");
		head.next.next.next=r.insert("d");
		
		r.print(head);
		
		temp=r.insert("a");
		temp.next=r.insert("b");
		temp.next.next=r.insert("a");
		temp.next.next.next=r.insert("d");
		
		r.print(temp);
		r.convert(head, temp);
		
	}

}
