package com.ye.structure.list;

public class IntegerArrayListExam {

	public static void main(String[] args) {
		IntegerArrayList list = new  IntegerArrayList();
		list.add(0, 300);	// 오토 박싱
		list.add(0, 200);
		list.add(0, 100);
		/* 100 200 300 */
		
		list.append(500);
		list.append(600);
		list.remove(3);
		/* 100 200 300 600 */		
		
		list.add(3, 250);
		list.add(1, 50);
		list.add(0, 10);
		list.append(700);
		list.remove(1);
		list.removeItem(600);
		/* 10 50 200 300 250 700 */
		
	}

}
