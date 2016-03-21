package solution;

import java.util.Stack;

class Node
{
int data;
Node left;
Node right;
Node(int n){
this.data=n;
this.left=null;
this.right=null;
}
}

public class NQueensNode {
	private int n=0;
NQueens(int n)
{
	if (n>0)
	this.n=n;
}

public void preOrder(Node root)
	{
	Stack<Node> bstack=new Stack<Node>();
	bstack.push(root);
	Node tmp=null;
	while(!bstack.isEmpty())
	{
		tmp=bstack.pop();
		System.out.println(tmp.data);
		
	}
	
	}

public static void main(String[] args) {
	Node n3=new Node(3);
	Node n2=new Node(2);
	Node n1=new Node(1);
	Node n4=new Node(4);
	Node n5=new Node(5);
	Node n6=new Node(6);
	Node n7=new Node(7);


	n4.left=n2;n4.right=n6;n6.left=n4;n6.right=n7;
	n2.left=n1;n2.right=n3;
	
}
}


  
