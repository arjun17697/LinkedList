package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.LinkedListClass;
import main.LinkedListNode;

public class GenericLinkedListTest {
	LinkedListClass<Integer> LinkedList;
	static private LinkedListNode<Integer> myFirstNode;
	static private LinkedListNode<Integer> mySecondNode;
	static private LinkedListNode<Integer> myThirdNode;

	@Before
	public void init() {
	myFirstNode = new LinkedListNode<Integer>(56);
	mySecondNode = new LinkedListNode<Integer>(30);
	myThirdNode = new LinkedListNode<Integer>(70);
	LinkedList= new LinkedListClass<Integer>();
	
	LinkedList.insert(myFirstNode);
	LinkedList.append(myThirdNode);
	LinkedList.push(myFirstNode,mySecondNode);
	LinkedList.printlist();
	}
	
	@Test
	public void ReturnTrueWhenMyFirstNodeAppend() {
		Assert.assertTrue((LinkedList.head).equals(myFirstNode));}
	@Test
	public void ReturnTrueWhenMySecondNodeAppend() {
		Assert.assertTrue(((LinkedList.head).getNext()).equals(mySecondNode));}
	@Test
		public void ReturnTrueWhenMyThirdNodeAppend() {
		Assert.assertTrue((LinkedList.tail).equals(myThirdNode));
		}	

	

	
}

