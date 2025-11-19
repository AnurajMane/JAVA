package doublyLL;

public class Entry {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.add(324);
		dll.add(765);
		dll.add(234);
		dll.add(7864);
		dll.add(234);
		dll.add(765);
		dll.add(765);
		dll.add(765);
		dll.display();
		System.out.println();
		dll.addAtPosition(1,987);
		dll.display();
		
		
		System.out.println("\ndeleteAll");
		dll.deleteAll(765);
		dll.display();
		
		
		
		
		
		

	}

}
