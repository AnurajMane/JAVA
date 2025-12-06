package binarytree;

public class Node {

	Node left;
	int data;
	Node right;
	
	public Node(int data) {
		super();
		this.left = null;
		this.data = data;
		this.right = null;
	}

	public Node getLeft() {
		return left;
	}

	public int getData() {
		return data;
	}

	public Node getRight() {
		return right;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
