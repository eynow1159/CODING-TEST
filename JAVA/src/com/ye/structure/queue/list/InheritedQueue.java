package com.ye.structure.queue.list;

import com.ye.structure.list.linked.LinkedList;
import com.ye.structure.queue.QueueInterface;

// 연결 리스트 클래스 LinkedList<E> 상속받기
public class InheritedQueue<E> extends LinkedList<E> implements QueueInterface<E>{
	public InheritedQueue() {
		super();
	}
	
	@Override
	public void enqueue(E newItem) {
		append(newItem);
	}
	
	@Override
	public E dequeue() { 
		return remove(0);
	}

	@Override
	public E front() {
		return get(0);
	}
	
	@Override
	public void dequeueAll() {
		clear();
	}
	
}
