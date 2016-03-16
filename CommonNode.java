package solution;

import java.util.*;
class BST<T> {
	private T data;
	private BST left;
	private BST right;
	private BST root;
	public BST(T data) {
		// TODO Auto-generated constructor stub
		if (data==null)
			throw new NullPointerException("Invalid value");
		this.data=data;
		root=(BST) data;
		left=null;
		right=null;
	}
	public BST getLeft(){
		return this.left;
	}
	public BST getRight(){
		return this.right;
	}
	public boolean setLeft(T left)
	{
		this.left=new BST(left);
		return true;
	}
	public boolean setRight(T right){
		this.right=new BST(right);
		return true;
	}
	public T getData(){
		return data;
	}
	public List<BST> inOrder(){
		//BST T;
		return inOrder(this.root,new LinkedList<BST>());
	}
	public List<BST> inOrder(BST<T> root,List<BST> listtree){
		if (root==null)
			return listtree;
		inOrder(root.getLeft(),listtree);
		listtree.add(root);
		inOrder(root.getRight(),listtree);
		return listtree;
	}
}
public class CommonNode {
	private static List<BST> commonlist;
CommonNode()
{
	commonlist=new LinkedList<BST>();
}
public static List<BST> findCommon(BST tree1,BST tree2){
	if (tree1==null || tree2==null)
	{
	commonlist=null;
	}
	else{
	LinkedList<BST> list1=(LinkedList<BST>)tree1.inOrder();
	LinkedList<BST> list2=(LinkedList<BST>)tree2.inOrder();
	commonlist=findIntrsectOfSortedList(list1,list2);
	}
	return commonlist;
}
private static List<BST> findIntrsectOfSortedList(LinkedList<BST> list1,
		LinkedList<BST> list2) {
	// TODO Auto-generated method stub
	List intrsctlist=new LinkedList<BST>();
	ListIterator<BST> tmp1=list1.listIterator();
	ListIterator<BST> tmp2=list2.listIterator();
	if (!(tmp1!=null && tmp2!=null))
	return null;
	BST eltlist1;
	BST eltlist2;
	outer:while(tmp1.hasNext()&& tmp2.hasNext())
	{
		eltlist1=tmp1.next();
		eltlist2=tmp2.next();
		innereq:while(eltlist1.getData().equals(eltlist2.getData()))
		{
			intrsctlist.add(eltlist1);
		}
		innergr8:while((Integer)eltlist1.getData()>(Integer)eltlist2.getData())
		{
			if(tmp2.hasNext())
			{
			eltlist2=tmp2.next();
			}
			else
				break outer;
			
		}
		innerless:while((Integer)eltlist1.getData()<(Integer)eltlist2.getData())
		{
			if(tmp1.hasNext())
			{
			eltlist1=tmp1.next();
			}
			else
				break outer;
			
		}
	}
	return intrsctlist;
}


}
