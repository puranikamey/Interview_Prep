package com.google;

public class bt {
	class Node {
		int key;
		
		Node rit, left;
		
		Node (int item){
			key=item;
			rit= left=null;		
		}
		
		
	}
	Node root;
/*	bt()
	{
		root =null;
	}
	*/

	void insert(int k) {
	root= insertrec(root, k);
		
	}
	
	Node insertrec (Node root, int key) {
		if (root==null) {
			root=new Node(key);
			return root;	
		}
		 if (key< root.key) 
			 root.left= insertrec (root.left, key);
		
		if (key> root.key) 
			root.rit=insertrec (root.rit, key);
			
		return root;
	}
	
	
	void inorder() {
		inorderred (root);
	}
	
	void inorderred (Node root) {
		if (root != null) {
			inorderred (root.left);
			System.out.println(root.key);
			inorderred (root.rit);
			
		}
		
		
	}
	
	
	public static void main(String[] args) {

		
		bt tree= new bt();

		
		tree.insert(50);
		tree.insert(30);
		tree.insert(67);
		tree.insert(23);
		tree.insert(88);
		tree.insert(87);
		tree.insert(90);
		tree.insert(11);
		tree.insert(23);
		
		tree.inorder();

		
		
	}

}
