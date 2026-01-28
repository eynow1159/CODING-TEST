package com.ye.baekjoon.bronze;

/*
problem: 2588
step: 1
tag: 
level: 브론즈 V

곱셈

문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

//

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

예제 입력 1 
472
385

예제 출력 1 
2360
3776
1416
181720

알고리즘 분류
수학
사칙연산
*/
import java.util.Scanner;

public class B2588 {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		int hundreds_place = B / 100;
		int tens_place = B % 100 / 10;
		int ones_place = B % 10;
		System.out.println(A*ones_place);
		System.out.println(A*tens_place);
		System.out.println(A*hundreds_place);

		System.out.println(A*B);
		sc.close();	}

}
