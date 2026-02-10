package com.ye.structure.stack.linked;

import com.ye.structure.list.ListInterface;
import com.ye.structure.list.linked.LinkedList;
import com.ye.structure.stack.StackInterface;
//import com.ye.structure.stack.array.ArrayStack;

public class ListStack<E> implements StackInterface<E> {
	private ListInterface<E> list;
	
	public ListStack() {	// 생성자
		list = new LinkedList<E>();
//		list = new ArrayStack<E>();
	}

	@Override
	public void push(E newItem) {
		list.add(0, newItem);
	}

	@Override
	public E pop() {
		return list.remove(0); 
	}

	@Override
	public E top() {
		return list.get(0);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public void popAll() {
		list.clear();
	}
	
}
