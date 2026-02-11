package com.ye.structure.hashTable;

import com.ye.structure.IndexInterface;
import com.ye.structure.Node;
import com.ye.structure.list.linked.LinkedList;

public class ArrayHashTable implements IndexInterface<Integer, Integer> {
	private Integer table[];
	int numItems = 0;
	static final Integer DELETED = -12345, NOT_FOUND = -1;
	
	public ArrayHashTable(int n) {
		table = new Integer[n];
		numItems = 0;
		for (int i = 0; i < n; i++) table[i] = null;		
	}
	
	private int hash(int i, Integer x) {
		return (x+i) % table.length;
	}

	@Override
	public Integer search(Integer x) {
		int slot;
		for (int i = 0; i < table.length; i++) {
			slot = hash(i, x);
			if (table[slot] == null) return NOT_FOUND;	// search failed
			if (table[slot].compareTo(x) == 0) return slot;
		}
		return NOT_FOUND;
	}

	@Override
	public void insert(Integer x) {
		int slot;
		if (numItems == table.length) { /* 에러 처리 */ } 
		else {
			for (int i = 0; i < table.length; i++) {
				slot = hash(i, x);
				if (table[slot] == null || table[slot] == DELETED) {
					table[slot] = x;
					numItems++;
					break;
				}
			}
		}
	}
	
	@Override
	public void delete(Integer x) {
		int slot = 0;
		for (int i = 0; i < table.length; i++) {
			slot = hash(i, x);
			if (table[slot] == null) break;
			if (table[slot].compareTo(x) == 0) {
				table[slot] = DELETED;
				numItems--;
				break;
			}
		}
	}

	public Integer getItem(Integer i) {
		return table[i];
	}
	
	// 기타
	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < table.length; i++)
			table[i] = null;
		numItems = 0;
	}
}
