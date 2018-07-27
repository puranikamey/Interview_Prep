package com.google;

class Node {
	int key;
	Node lft, rit;
	
public  Node(int item) {
	key =item;
	lft =rit=null;	
}	
	
}

public class Binarytree {

	Node root;
	Binarytree(int key){
		
		root=new Node(key);
		
	}	
	Binarytree()
	{
		root=null;
	}
	
	public static void main(String[] args) {
		
		Binarytree bt = new Binarytree();
		
	    bt.root = new Node(1);
	    bt.root.lft =new Node(3);
	    bt.root.rit= new Node (4);

	}

}
