package com.ye.baekjoon.bronze;

/*
problem: 11382
step: 1
tag: 
level: 브론즈 V

꼬마 정민
 
문제
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

입력
첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.

출력
A+B+C의 값을 출력한다.

예제 입력 1 
77 77 7777

예제 출력 1 
7931

알고리즘 분류
수학
구현
사칙연산
*/
import java.util.Scanner;

public class B11382 {

	public static void main(String[] args) {
		long A, B, C;	// 입력 범위가 커서 int로 받으면 오버플로우가 날 수 있음
		Scanner sc = new Scanner(System.in);
		A = sc.nextLong();
		B = sc.nextLong();
		C = sc.nextLong();
		System.out.println(A+B+C);
		sc.close();	}

}
