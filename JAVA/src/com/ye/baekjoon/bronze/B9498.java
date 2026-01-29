package com.ye.baekjoon.bronze;

/*
problem: 9498
step: 2
tag: 
level: 브론즈 V

시험 성적

문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.

예제 입력 1 
100

예제 출력 1 
A

알고리즘 분류
구현
*/

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch (score/10) {
//		case 10, 9: {	// Java 14+ 
		case 10:
		case 9: {
			System.out.println("A");
			break;
		}
		case 8: {
			System.out.println("B");
			break;
		}
		case 7: {
			System.out.println("C");
			break;
		}
		case 6: {
			System.out.println("D");
			break;
		}
		default:
			System.out.println("F");
		}

		sc.close();
	}

}
