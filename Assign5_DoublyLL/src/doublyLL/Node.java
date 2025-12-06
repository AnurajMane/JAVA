package doublyLL;

public class Node {

	Node previous;
	int data;
	Node next;
	
	public Node(int data) {
		super();
		this.previous = null;
		this.data = data;
		this.next = null;
	}	
}