package Singly;

public class SinglyLinkedList extends Node implements SinglyLLInterface {

	Node head,tail;
	

	
	public SinglyLinkedList(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}


	// h          t
	// 11-> 22-> 32
	@Override
	public void addElement(int element) {
		Node n1 = new Node(element);
		
		if(head==null)
		{
			head=tail=n1;
			return;
		}
		tail.next=n1;
		tail=n1;
			
	}
	public void print()
	{
		Node move=head;
		while(move!=null) {
			System.out.print( "-"+move.data);
			move=move.next;
			
			
			
		}
	}
	
	
	
//	public void delete(int element) {
//		if(start == null || current == null) {
//			System.out.println("List is Empty");
//			return;
//		}
//		
//		if(start == current || start.next == null) {
//			start = current = null;
//		}
//		
//		for(int i = 0; i < count-1; i++) {
//			
//			if(current.data == element) {
//				Node temp = current.next;
//				current.next = temp;
//				break;
//			}
//			
//			current = current.next;
//		}
//		
//		count--;
//		
//	}
	
	@Override
	public void deleteAll(int element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean search(int element) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void delete(int element) {
		// TODO Auto-generated method stub
		
	}
	

}
