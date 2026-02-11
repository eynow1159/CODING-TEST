package com.ye.structure.hashTable;

import com.ye.structure.IndexInterface;
import com.ye.structure.Node;
import com.ye.structure.list.linked.LinkedList;

public class ChainedHashTable implements IndexInterface<Node, Integer> {
	private LinkedList<Integer>[] table;
	int numItems = 0;
	
	public ChainedHashTable(int n) {
		table = (LinkedList<Integer>[]) new LinkedList[n];
		for (int i = 0; i < n; i++)
			table[i] = new LinkedList<>();
		numItems = 0;
	}
	
	private int hash(Integer x) {
		return x % table.length;	// 간단한 예
	}

	// [알고리즘 12-1] 구현: 검색, 삽입, 삭제
	@Override
	public Node search(Integer x) {
		int slot = hash(x);
		if (table[slot].isEmpty()) return null;	// null list
		else {
			int i = table[slot].indexOf(x);
			if (i == LinkedList.NOT_FOUND) return null;	// null exist
			else return table[slot].getNode(i);
		}
	}

	@Override
	public void insert(Integer x) {
		int slot = hash(x);
		table[slot].add(0, x);
		numItems++;
	}

	@Override
	public void delete(Integer x) {
		if (isEmpty()) { /* 에러 처리 */ }
		else {		
			int slot = hash(x);
			table[slot].removeItem(x);
			numItems--;
		}
	}
	
	// 기타
	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < table.length; i++)
			table[i] = new LinkedList<>();
		numItems = 0;
	}
	
}
