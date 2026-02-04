package com.ye.structure.list.array.generic;

public class StringArrayListExam {

	public static void main(String[] args) {
		ArrayList<String> list = new  ArrayList<>();
		list.add(0, "test");	
		list.add(0, "sample");	
		list.add(0, "String");	
		/* String sample test */
		
		list.append("test2");
		/* String sample test test2 */
		
		list.remove(3);
		/* String sample test */	
		
		list.add(3, "added-at-3");
		list.add(1, "added-at-1");
		list.add(0, "added-at-0");
		/* added-at-0 String added-at-1 sample test added-at-3 */	
		
		list.append("appended");
		/* added-at-0 String added-at-1 sample test added-at-3 appended */	
		
		list.remove(1);
		/* added-at-0 added-at-1 sample test added-at-3 appended */
		
		list.removeItem("added-at-3");
		/* added-at-0 added-at-1 sample test appended */
		
	}

}
