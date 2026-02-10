package com.ye.structure.stack.linked;

import com.ye.structure.list.linked.LinkedList;
import com.ye.structure.stack.StackInterface;

public class InheritedStack<E> extends LinkedList<E> implements StackInterface<E> {
	public InheritedStack() {	// 생성자
		super();
	}

	@Override
	public void push(E newItem) {
		add(0, newItem);
	}

	@Override
	public E pop() {
		if (!isEmpty()) { 
			return remove(0); 
		} else { return null; }
	}

	@Override
	public E top() {
		return get(0);
	}

	@Override
	public void popAll() {
		clear();
	}
	
}
