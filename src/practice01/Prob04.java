package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		// 중첩 loop
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		int length = text.length(); // text길이구하는 메소드
		for (int i = 1; i < length+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(text.charAt(j));
			}
			System.out.println("\n");
		}

		/*
		 * char c0 = text.charAt(0); // 그 string자릿수에 맞는 문자 뽑기, 보통 배열인데, 이렇게도 쓸수있으ㅡㅁ char
		 * 
		 * c1 = text.charAt(1); char c2 = text.charAt(2); System.out.print(c1);
		 */
		scanner.close();
	}
}