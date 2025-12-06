package binarytree;

import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(null);
		
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			//System.out.println(Integer.MAX_VALUE);
			do {
				System.out.println("\n1. Add Node\n2. Pre-Order\n3. In-Order\n4. Post-Order\n5. Search Node\n6. Get Count of Leaf nodes\n7. Height\n8. Count with value\n9. Smallest\n10. Largest\n11. Exit\nEnter your choice : ");
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1:
					//implemented
			        System.out.print("Enter value to add: ");
			        int data = sc.nextInt();
			        BinaryTree.addNode(data);
			        break;
			    case 2:
			    	//implemented
			    	BinaryTree.preOrderTraversal(tree.getRoot());
			        break;
			    case 3:
			    	//implemented
			    	BinaryTree.inOrderTraversal(tree.getRoot());
			        break;
			    case 4:
			    	//implemented
			    	BinaryTree.postOrderTraversal(tree.getRoot());
			        break;
			    case 5:
			    	//implemented
			        System.out.print("Enter value to search: ");
			        int element = sc.nextInt();
			        BinaryTree.search(tree.getRoot(), element);
			        break;
			    case 6:
			    	//implemented
			        int countNode = BinaryTree.countOfLeafs(tree.getRoot());
			        System.out.println("Total leaf nodes : " + countNode);
			        break;
			    case 7:
			    	//implemented
			        int nodes = BinaryTree.height(tree.getRoot());
			        System.out.println("Total height of tree : " + nodes);
			        break;
			    case 8:
			    	//implemented
			    	System.out.print("Enter value to count: ");
			        int value = sc.nextInt();
			        int count = BinaryTree.countNodesWithValue(tree.getRoot(),value);
			        System.out.println("Count : " + count);
			        break;
			    case 9:
			    	nodes = BinaryTree.smallest(tree.getRoot());
			        System.out.println("smallest value of tree : " + nodes);
			        break;
			    case 10:
			    	nodes = BinaryTree.largest(tree.getRoot());
			        System.out.println("Largest value of tree : " + nodes);
			        break;
			    case 11:
			    	
			        System.out.println("Exiting...");
			        break;
			        
			    default:
			        System.out.println("Invalid choice. Please try again.");			
				}
				
			}while(choice < 15);
		}
	}

}
