package Binarytree.com;

import java.util.ArrayList;

class Node{
	Node leftnode;
	Node rightnode;
	int nodeData;
	
	Node(int data){
		
		//Node temp = new Node(data);
		
        nodeData = data;
        leftnode = null;
        rightnode = null;
	}
}
public class tree {
	public static ArrayList<Integer> longestPath(Node root){
		if(root == null) {
		 ArrayList<Integer> path = new ArrayList<>();
		 return path;
		}
		// Recursive call on root.right
		ArrayList<Integer> rightnode = longestPath(root.rightnode);
		//Recursive call on root.left
		ArrayList<Integer> leftnode = longestPath(root.leftnode);
		
		if(rightnode.size() < leftnode.size()) {
			leftnode.add(root.nodeData);
		}else {
			rightnode.add(root.nodeData);
		}
		return (leftnode.size()>rightnode.size() ? leftnode : rightnode);
	}
	public static void main(String[] args) {
		
		Node root = new Node(100);
		
		Node node1 = new Node(20);
		Node node2 = new Node(130);
		Node node3 = new Node(10);
		Node node4 = new Node(50);
		Node node5 = new Node(110);
		Node node6 = new Node(140);
		Node node7 = new Node(5);
		
		node3.leftnode = node7;
		
		node1.leftnode = node3;
		node1.rightnode = node4;
		
		node2.leftnode = node5;
		node2.rightnode = node6;
		
		root.leftnode = node1;
		root.rightnode = node2;
		
		ArrayList<Integer> path = longestPath(root);
		int n = path.size();
		
		System.out.println(path.get(n - 1));
		for(int i = n - 2;i >= 0;i--) {
			System.out.println("->" + path.get(i));
		}
	}
 
}

