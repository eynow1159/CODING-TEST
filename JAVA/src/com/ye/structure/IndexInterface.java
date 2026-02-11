package com.ye.structure;

public interface IndexInterface<T, K> {
//public interface IndexInterface<T> {
//	public T search(Comparable x);
//	public void insert(Comparable x);
//	public void delete(Comparable x);
	public T search(K x);
	public void insert(K x);
	public void delete(K x);
	public boolean isEmpty();
	public void clear();
}
