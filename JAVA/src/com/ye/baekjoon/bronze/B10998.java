package com.ye.baekjoon.bronze;

/*
problem: 10998
step: 1
tag: 
level: 브론즈 V

A×B
 
문제
두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A×B를 출력한다.

예제 입력 1 
1 2

예제 출력 1 
2

예제 입력 2 
3 4

예제 출력 2 
12

알고리즘 분류
수학
구현
사칙연산
*/

import java.util.Scanner;

public class B10998 {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A*B);
		sc.close();
	}

}
