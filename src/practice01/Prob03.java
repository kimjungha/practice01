package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		// 홀수인지짝수인지 판단 후 그에 맞게 무한루프로 실행
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요:");
			int number = scanner.nextInt();
			int sum = 0;

			if (number % 2 == 0) { // 짝수인 경우
				for (int i = 2; i <= number; i = i + 2) {
					sum = sum + i;
				}
				System.out.println("결과 값:" + sum);
			} else {
				for (int i = 1; i <= number; i = i + 2) {
					sum = sum + i;
				}
				System.out.println("결과 값:" + sum);

			}

		}

	}
}
