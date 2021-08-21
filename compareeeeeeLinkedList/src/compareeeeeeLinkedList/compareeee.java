package compareeeeeeLinkedList;


public class compareeee {
	class Node 
	{
		String  data;
		Node next;
		Node (String data)
		{
			this.data=data;
			next=null;
			
		}
	}
	public Node insert (String d)
	{
		Node n=new Node(d);
		return n;
		
	}
	void print(Node head)
	   {
		   Node cu=head;
		   while(cu!=null)
		   {
			   System.out.println(cu.data);
			   cu=cu.next;
		   }
	   }
	public void  convert(Node head,Node item)
	{    
		
		
		String s="";
		String v="";
		Node sun=head;
		Node temp=item;
		while(sun!=null)
		{
			s=s.concat(sun.data);
			sun=sun.next;
		}
		while(temp!=null)
		{
			v=v.concat(temp.data);
			temp=temp.next;
		}
		boolean b=s.equalsIgnoreCase(v);
		System.out.println(b);
		
	}
	
	
	
	
	
}
