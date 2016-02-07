package Trees;

import Queue.Queue;

class Node {
	public Node left;
	public Node right;
	public int data;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;

	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String toString() {
		return String.valueOf(data);
	}
}

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insertElement(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {
			Node helper = root;
			Node parent;

			while (true) {
				parent = helper;

				if (data <= helper.data) {
					helper = helper.left;
					if (helper == null) {
						parent.left = newNode;
						return;
					}
				} else {
					helper = helper.right;
					if (helper == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public static void inOrder(Node focus) {
		if (focus == null) {
			return;
		} else {
			inOrder(focus.left);
			System.out.println(focus.toString());
			inOrder(focus.right);
		}
	}

	public static void preOrder(Node focus) {
		if (focus == null) {
			return;
		} else {
			System.out.println(focus);
			preOrder(focus.left);
			preOrder(focus.right);
		}
	}

	public Node getRoot() {
		return this.root;
	}

	/* Functions to count number of nodes */
	public int countNodes() {
		return countNodes(root);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(Node root) {
		if (root == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(root.getLeft());
			l += countNodes(root.getRight());
			return l;
		}
	}

	/**
	 * My custom exception class.
	 */
	class CustomNullException extends Exception {
		public CustomNullException(String message) {
			super(message);
		}
	}

	public static int findMax(Node focus) {
		int focus_val, left, right, max = Integer.MIN_VALUE;

		if (focus != null) {
			focus_val = focus.getData();
			left = findMax(focus.getLeft());
			right = findMax(focus.getRight());

			if (left > right)
				max = left;
			else
				max = right;
			if (focus_val > max)
				max = focus_val;
		}
		return max;
	}

	public static int findMaxNonRecurse(Node focus) {
		Node temp;
		int max = Integer.MIN_VALUE;
		Queue q = new Queue();
		q.enqueue(focus);

		while (!q.isEmpty()) {
			temp = (Node) q.dequeue();

			if (temp.getData() > max)
				max = temp.getData();

			if (temp.getLeft() != null)
				q.enqueue(temp.left);

			if (temp.getRight() != null)
				q.enqueue(temp.right);
		}
		return max;
	}

	public static int findElement(Node focus, int data) {
		int temp;
		if (focus == null) {
			return 0;
		} else {
			if (focus.getData() == data) {
				return 1;
			} else {
				temp = findElement(focus.left, data);
				if (temp != 0)
					return temp;
				else
					return findElement(focus.right, data);
			}
		}
	}

	public static int findElementNonRecurse(Node focus, int data) {
		Node temp;
		if (focus == null)
			return 0;

		Queue q = new Queue();
		q.enqueue(focus);

		while (!q.isEmpty()) {
			temp = (Node) q.dequeue();
			if (temp.getData() == data) {
				System.out.println("You are here");
				return 1;
			}
			if (temp.getLeft() != null)
				q.enqueue(temp.getLeft());
			if (temp.getRight() != null)
				q.enqueue(temp.getRight());
		}
		return 0;
	}

	public int size(Node focus) {
		if (focus == null) {
			return 0;
		} else {
			return (size(focus.getLeft()) + size(focus.getRight()) + 1);
		}

	}

	public static int heightOfBinaryTree(Node focus) {
		int leftHeight,rightHeight;
		if (focus==null) {
			return 0;
		} else {
			leftHeight=heightOfBinaryTree(focus.left);
			rightHeight=heightOfBinaryTree(focus.right);
			
			if(leftHeight>rightHeight)
				return(leftHeight+1);
			else
				return(rightHeight+1); 
		}
	}
	
	public static int heightOfBinaryTreeNonRecurse(Node focus){
		int height=0;
		Queue q=new Queue();
		
		if(focus==null)
			return 0;
		
		q.enqueue(focus);
		 
		while(true){
			int nodeCount=q.size();
               
			if(nodeCount==0)
				return height;
			
			height++;
			
			while(nodeCount>0){
				
				Node temp=null;
				temp=(Node)q.dequeue();
				if (temp!=null && temp.getLeft()!=null)
				  q.enqueue(temp.getLeft());
				if (temp!=null && temp.getRight()!=null)
					q.enqueue(temp.getRight());				
				nodeCount--;	
				
			}
			  
		  }
		
		
	}
	
	public static boolean remove (Node root,int data)throws CustomNullException{
		if (root == null) {
			System.out.println("tree is empty");
			return false;
		} else {
			Node focus = root;
			Node parent = root;

			boolean isLeft = true;

			while (focus.data != data) {
				parent = focus;
				if (data <= focus.data) {
					focus = focus.left;
					isLeft = true;
				} else {
					focus = focus.right;
					isLeft = false;
				}
				if (focus == null)
					return false;
					//throw new CustomNullException("Node with data not present");
			}

			if (focus.right == null && focus.left == null) {
				if (isLeft == true) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			}
			
			else if(focus.left==null){
				if(isLeft==true){
					parent.left=focus.right;
				}
				else{
					parent.right=focus.left;
				}
			}
			
			else if(focus.right==null){
				if(isLeft==true){
					parent.left=focus.left;
				}
				else{
					parent.right=focus.right;
				}
			}
			
			else{
				Node temp=focus.getRight();
				Node tempParent=focus.getRight();
				if(temp.left==null){
					focus.setData(temp.getData());
					focus.setRight(temp.getRight());
				}
				while(temp.getLeft()!=null){
					tempParent=temp;
					temp=temp.getLeft();
				}
				
				focus.setData(temp.getData());
				tempParent.setLeft(null);
			}

		}
		return true;

	}


	public static void main(String args[]) {
		BinarySearchTree myTree = new BinarySearchTree();
		myTree.insertElement(5);
		myTree.insertElement(10);
		myTree.insertElement(15);
		myTree.insertElement(3);
		myTree.insertElement(7);
		myTree.insertElement(6);
		myTree.insertElement(8);
		// myTree.inorder(myTree.getRoot());
		System.out.println(myTree.countNodes());
		inOrder(myTree.getRoot());
		System.out.println("Max is: " + findMax(myTree.getRoot()));
		System.out.println("Max is: " + findMaxNonRecurse(myTree.getRoot()));

		int findData1 = findElement(myTree.getRoot(), 10);
		System.out.println(findData1);
		int findData2 = findElementNonRecurse(myTree.getRoot(), 10);

		if (findData1 == 1)
			System.out.println("Data found in tree");
		else
			System.out.println("Data not found in tree");

		if (findData2 == 1)
			System.out.println("Data found in tree");
		else
			System.out.println("Data not found in tree");
		System.out.println(myTree.size(myTree.getRoot()));
		
		System.out.println(heightOfBinaryTree(myTree.getRoot()));
		System.out.println(heightOfBinaryTreeNonRecurse(myTree.getRoot()));
		
		try{
		System.out.println(remove(myTree.getRoot(),5));
		}
		catch(CustomNullException e){
			e.printStackTrace();
		}
		inOrder(myTree.getRoot());
		preOrder(myTree.getRoot());
	}

}
