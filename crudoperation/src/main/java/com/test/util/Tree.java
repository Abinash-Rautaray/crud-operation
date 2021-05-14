package com.test.util;

class Node {
	int item;
	Node left, right;

	public Node(int key) {
		item = key;
		left = right = null;
	}
}

class Tree {
	// root of Tree
	Node root;
	int sum =0;
	Tree() {
		root = null;
	}

	void inOrder(Node node) {
		if (node == null)
			return;

		// traverse the left child
		System.out.println("Left : "+node.item);
		inOrder(node.left);

		// traverse the root node
		//System.out.print(node.item + "->");
		if(node.left == null && node.right==null) {
			this.sum = this.sum + node.item;
		}

		// traverse the right child
		System.out.println("Right :"+node.item);
		inOrder(node.right);
	}
	
	void inOrder(Node node,String direction) {
		if (node == null)
			return;

		// traverse the left child
		System.out.println("Direction : "+direction+node.item);
		inOrder(node.left,"Left");

		// traverse the root node
		//System.out.print(node.item + "->");
		if(node.left == null && node.right==null) {
			this.sum = this.sum + node.item;
		}
		System.out.println("Direction1 : "+direction+node.item);
		// traverse the right child
		inOrder(node.right,"Right");
	}

	public static void main(String[] args) {

		// create an object of Tree
		Tree tree = new Tree();

		// create nodes of tree
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);

		// create child nodes of left child
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);

		System.out.println("In Order traversal");
		tree.inOrder(tree.root,"Root");
		
		System.out.println("\nSum : " + tree.sum);
	}
}