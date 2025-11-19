package doublyLL;

public class DoublyLinkedList implements DoublyLLInterface {

	Node current;
	Node head;
	Node tail;
	int count;
	
	
	public DoublyLinkedList() {
		
		count = 1;
		
	}

	@Override
	public void add(int element) {
		
		Node newNode = new Node(element);
		
		if(head == null) {
			head = current = tail =  newNode;
			return;
		}
		newNode.previous=tail;
		tail.next=newNode;
		tail=newNode;
		count++;
		return;
	}

	@Override					// 2
	public void addAtPosition(int position, int element) {
		
		Node newNode = new Node(element);
		
		newNode.next = null;
		newNode.previous = null;
		
		//if list is empty
		if(head == null) {
			head = current = tail =  newNode;
			count++;
			return;
		}
		
		//if list is not empty
		if(position == 1) {
			newNode.next = head;
			head = newNode;
			count++;
			return;
		}
		
		
		current = head;
		
		while(position > 2) {
			
			current = current.next;
			position--;
		}
		
		if(current == tail) {
			addAtLast(element);
			return;
		}
		
		current.next.previous = newNode;
		newNode.next = current.next;
		current.next = newNode;
		newNode.previous = current;
		count++;
	
	}

	
	public void addAtLast(int element) {
		Node newNode = new Node(element);
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
		count++;
		return;
		
	}

	@Override
	public void delete(int element) {
		
		current = head;
		if(head == null || head.data == element) {
			System.out.println("List is Empty");
			return;
		}
		
		for(int i = 0; i < count; i++) {
			
			if(current.data == element) {
				current.previous.next = current.next;
				current.next.previous = current.previous;
				break;
			}
			current=current.next;
		}
		count--;
	}

	@Override
	public void deleteAll(int element) {
		current = head;
		if(head == null || head.data == element) {
			System.out.println("List is Empty");
			return;
		}
		
		
		
		while(current != tail) {
			
			if(current.data == element) {
				current.previous.next = current.next;
				current.next.previous = current.previous;
			}
			current=current.next;
		}
		count--;
		
	}
	
	
	//          c
	// 11 22 33

	@Override
	public void display() {
		current = head;
		System.out.println(count);
		while(current != null) {
			
			System.out.print(current.data + "\t");
			current = current.next;
		}
	}	
}