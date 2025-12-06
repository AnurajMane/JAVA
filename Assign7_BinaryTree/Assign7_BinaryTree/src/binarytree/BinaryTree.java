package binarytree;

public class BinaryTree {
	
	static int count;
	static Node root, move;
	public static int countNode = 0;
	

	public BinaryTree(Node root) {
		this.count = 0;
		this.root = root;
	}




	public static void addNode(int data) {
		Node newNode = new Node(data);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		else {
			Node move = root;
			while(true) {
				if(newNode.getData() < move.getData()) {
					if(move.getLeft() == null) {
						move.setLeft(newNode);
						System.out.println("Node added at left of " + move.getLeft().toString());
						break;
					}
					else {
						move = move.getLeft();
					}
				}
				else if(newNode.getData() > move.getData()) {
					if(move.getRight() == null) {
						move.setRight(newNode);
						System.out.println("Node added at right of " + move.getRight());
						break;
					}
					else {
						move = move.getRight();
					}
				}
				else {
					if(move.getLeft() == null) {
						move.setLeft(newNode);
						System.out.println("Node added at left of " + move.getRight());
						break;
					}
					else {
						move = move.getLeft();
					}
				}
				
				count++;
			}
		}
		
	}

	public static void preOrderTraversal(Node move) {
		
		if(move != null) {
			System.out.print(move.getData() + "  ");
			preOrderTraversal(move.getLeft());
			preOrderTraversal(move.getRight());
		}
		
	}

	public static void inOrderTraversal(Node move) {
		if(move != null) {
			inOrderTraversal(move.getLeft());
			System.out.println(" "+move.getData());
			inOrderTraversal(move.getRight());
		}
	}

	public static void postOrderTraversal(Node move) {
		if(move != null) {
			inOrderTraversal(move.getLeft());
			inOrderTraversal(move.getRight());
			System.out.println(" "+move.getData());
		}
		
	}

	public Node getRoot() {
		
		return root;
	}

	public int getCount() {
		return count;
	}
	
	public static int countOfLeafs(Node root) {
		
		if (root == null) return 0;
		if (root.getLeft() == null && root.getRight() == null) {
	        
	        return 1;
	    }
			
		return countOfLeafs(root.getLeft()) + countOfLeafs(root.getRight()); 
	}

	public static int height(Node root) {
	    if (root == null) {
	        return 0;
	    }

	    
	    int leftHeight = height(root.left);
	    int rightHeight = height(root.right);

	    
	    return Math.max(leftHeight, rightHeight) + 1;
	}

	public static void search(Node root, int element) {

		move = root;
		
		while(move != null) {
			if(move.data == element) {
				System.out.println("Element found..........!!");
				return;
			}
			if(element < move.data) {
				move = move.left;
				
			}
			else {
				move = move.right;
				
			}
		}
		System.out.println("Element not fount...........!!");
		return;
	}



	
	
	public static int countNodesWithValue(Node root, int value) {
		if (root == null) return 0;

	    countNode = (root.data == value) ? 1 : 0;
	    countNode += countNodesWithValue(root.left, value);
	    countNode += countNodesWithValue(root.right, value);

		return countNode;

	}



	
	
	public static int smallest(Node root) {
	    if (root == null) return Integer.MAX_VALUE;

	    int leftMin = smallest(root.left);
	  

	    return Math.min(root.data,leftMin);
	}




	public static int largest(Node root) {
		if (root == null) return 0;

	    int rightMin = largest(root.right);
	    
	    return Math.max(root.data,rightMin);
	}
}