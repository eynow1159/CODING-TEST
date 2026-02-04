package com.ye.structure.list.linked;

import com.ye.structure.list.ListInterface;

public class CircularDoublyLinkedList<E> implements ListInterface<E> {
	private BidirectionNode<E> head;
	private int numItems;

	public CircularDoublyLinkedList() {	// 생성자 
		numItems = 0;
		head = new BidirectionNode(null);	// 더미 헤드
		head.prev = head.next = head;
	}

	@Override
	public void add(int index, E x) {	// 첫 번째 원소는 0번 원소
		if (index >= 0 && index <= numItems) {
			BidirectionNode<E> prevNode = getNode(index-1);
			BidirectionNode<E> newNode = new BidirectionNode<>(prevNode, x, prevNode.next);
			newNode.next.prev = newNode;
			prevNode.next = newNode;
			numItems++;
		} else { /*에러 처리*/ }		
	}

	@Override
	public void append(E x) {
		BidirectionNode<E> prevNode = head.prev;
		BidirectionNode<E> newNode = new BidirectionNode(prevNode, x, head);
		prevNode.next = newNode;
		head.prev = newNode;
		numItems++;
	}

	@Override
	public E remove(int index) {
		if (index >= 0 && index <= numItems-1) {
			BidirectionNode<E> currNode = getNode(index);
			currNode.prev.next = currNode.next;
			currNode.next.prev = currNode.prev;
			return currNode.item;
		} else {
			return null;
		}	
	}

	@Override
	public boolean removeItem(E x) {
		BidirectionNode<E> currNode = head;	// 더미 헤드
		for (int i = 0; i < numItems; i++) {
			currNode = currNode.next;
			if (((Comparable)(currNode.item)).compareTo(x) == 0) {
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;
				numItems--;
				return true;
			}
		}
		return false;
	}

	@Override
	public E get(int index) {
		if (index >= 0 && index <= numItems-1)
			return getNode(index).item;
		else 
			return null;	// 에러
	}

	public BidirectionNode<E> getNode(int index) {	// 첫 번째 원소는 0번 원소
		if (index >= -1 && index <= numItems-1) {
			BidirectionNode<E> currNode = head;
			
			if (index < numItems/2) {
				for (int i = 0; i <= index; i++) {
					currNode = currNode.next;
				}	
			} else {
				for (int i = numItems-1; i >= index; i--) {
					currNode = currNode.prev;
				}
			}
			return currNode;
		} else  {
			return null;	// 에러
		}
	}

	@Override
	public void set(int index, E x) {
		if (index >= 0 && index <= numItems-1)
			getNode(index).item = x;
		else { /*에러 처리*/ }		
	}

	private final int NOT_FOUND = -12345;
	@Override
	public int indexOf(E x) {
		BidirectionNode<E> currNode = head;
		for (int i = 0; i <= numItems-1; i++) {
			currNode = currNode.next;
			if ( ((Comparable)(currNode.item)).compareTo(x) == 0)
				return i;
		}
		return NOT_FOUND;
	}

	@Override
	public int len() {
		return numItems;
	}

	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	@Override
	public void clear() {
		numItems = 0;
		head.prev = head.next = head;
	}	

}
