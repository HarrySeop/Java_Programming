/*
 * 학기: 2023년 1학기
 * 과목: Java Programming
 * 과제: J1_1
 * 소속: IT융합자율학부
 * 이름: 박지섭
 * 학번: 202114154
 */
import java.util.Scanner;

public class J1_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("상자 용량: ");
		int Box = scanner.nextInt();
		
		System.out.print("사과 개수: ");
		int Apple = scanner.nextInt();
		
		int BoxCount = Apple / Box;
		// 상자 개수를 '사과량 / 상자용량'으로 계산했습니다
		
		int RemainApple = Apple % Box;
		// 남은 사과는 '사과량을 상자용량으로 나눠서 남는 값을 넣었습니다
		
		System.out.println("필요한 상자 개수: " + BoxCount);
		System.out.println("남는 사과 개수: " + RemainApple);
		
		scanner.close();
	}
}
