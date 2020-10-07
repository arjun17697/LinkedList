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
	LinkedList.append(mySecondNode);
	LinkedList.append(myThirdNode);
	LinkedList.insertAfter(30, 40);

	}
	

	@Test
	public void When40isSearchedItShouldLieBefore70() {
		Assert.assertEquals(myThirdNode,LinkedList.search(40).getNext());
		}	
	}	

	

	

