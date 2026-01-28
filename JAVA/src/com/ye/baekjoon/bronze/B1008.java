package com.ye.baekjoon.bronze;

/*
problem: 1008
step: 1
tag: 
level: 브론즈 V

A/B

문제
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

예제 입력 1 
1 3

예제 출력 1 
0.33333333333333333333333333333333
10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.

예제 입력 2 
4 5

예제 출력 2 
0.8

알고리즘 분류
수학
구현
사칙연산
*/

import java.util.Scanner;

public class B1008 {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
        System.out.println((double) A / B);
//		System.out.printf("%.9f\n", (double) A / B);
		sc.close();
	}

}
