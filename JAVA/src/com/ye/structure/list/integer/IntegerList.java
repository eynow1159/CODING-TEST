package com.ye.structure.list.integer;

public class IntegerList implements IntegerListInterface {
	private Integer[] item;
	private int numItems;
	private final int DEFAULT_CAPACITY = 64;
	
	public IntegerList() {	// 생성자 1
		this.item = new Integer[DEFAULT_CAPACITY];
		this.numItems = 0;
	}
	
	public IntegerList(int n) {	// 생성자 2
		this.item = new Integer[n];
		this.numItems = 0;
	}

	// [알고리즘 5-1] 구현: 배열 리스트의 k번째 자리에 원소 x 삽입하기
	@Override
	public void add(int index, Integer x) {
		if (numItems >= item.length || index < 0 || index > numItems) {
			/*에러 처리*/
		} else {
			for (int i = numItems-1; i >= index; i--) {
				item[i+1] = item[i];	// 우시프트
			}
			item[index] = x;
			numItems++;
		}		
	}

	// [알고리즘 5-2] 구현: 배열 리스트의 맨 뒤에 원소 x 추가하기
	@Override
	public void append(Integer x) {
		if (numItems >= item.length) {
			/*에러 처리*/
		} else {
			item[numItems++] = x;
		}		
	}

	// [알고리즘 5-3] 구현: 배열 리스트의 k번째 원소 삭제하기
	@Override
	public Integer remove(int index) {
		if (isEmpty() || index < 0 || index > numItems-1) {
			return null;
		} else {
			Integer tmp = item[index];
			for (int i = index; i < numItems-2; i++) {
				item[i] = item[i+1];	// 좌시프트
			}
			numItems--;
			return tmp;
		}	
	}

	// [알고리즘 5-4] 구현: 배열 리스트에서 원소 x 삭제하기
	@Override
	public boolean removeItem(Integer x) {
		int k = 0;
		while (k < numItems && item[k].compareTo(x) != 0)
			k++;
		if (k == numItems) {
			return false;
		} else {
			for (int i = 0; i < item.length; i++) {
				item[i] = item[i+1];	// 좌시프트
			}
			numItems--;
			return true;
		}
	}

	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, Integer x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indexOf(Integer x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int len() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	// [알고리즘 5-8(3)] 구현: 배열 리스트 깨끗이 청소하기
	@Override
	public void clear() {
		item = new Integer[item.length];
		numItems = 0;
	}	

}
