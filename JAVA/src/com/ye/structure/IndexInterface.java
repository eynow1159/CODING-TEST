package com.ye.structure;

public interface IndexInterface<R, E> {
//public interface IndexInterface<T> {
//	public T search(Comparable x);
//	public void insert(Comparable x);
//	public void delete(Comparable x);
	public R search(E x);
	public void insert(E x);
	public void delete(E x);
	public boolean isEmpty();
	public void clear();
}
