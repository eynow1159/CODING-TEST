package com.ye.structure.list.linked;

public class BidirectionNode<E> {

	public BidirectionNode<E> prev;
	public E item;
	public BidirectionNode<E> next;
	
	public BidirectionNode() {
		prev = next = null;
		item = null;
	}
	
	public BidirectionNode(E newItem) {
		prev = next = null;
		item = newItem;
	}

	public BidirectionNode(BidirectionNode<E> prevNode, E newItem, BidirectionNode<E> nextNode) {
		prev = prevNode; next = nextNode;
		item = newItem;
	}	
}
