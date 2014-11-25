package com.datastructs;

public class ListNodeOperations {
	public static void main(String args[]){
		ListNodeOperations lo = new ListNodeOperations();
		ListNode headNode = null;
		System.out.println(lo.ListLength(headNode));
	}

	public int ListLength(ListNode headNode){
		int length = 0;
		ListNode curr = headNode;
		while(curr!=null){
			length++;
			curr = curr.getNext();
		}
		return length;
	}

	public ListNode InsertInLinkedList(ListNode headNode, ListNode nodeToInsert, int position){
		if(headNode==null)
			return nodeToInsert;
		int size = ListLength(headNode);
		if(position > size+1 || position < 1){
			System.out.println("Position of node to insert is invalid. The valid inputs are 1 to " + (size+1));
			return headNode;
		}
		if(position==1){
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		} else {
			ListNode previousNode = headNode;
			int count = 1;
			while(count < position + 1){
				previousNode = previousNode.getNext();
				count++;
			}
			ListNode currNode = previousNode.getNext();
			nodeToInsert.setNext(currNode);
			previousNode.setNext(nodeToInsert);
		}


		return nodeToInsert;
	}
}
