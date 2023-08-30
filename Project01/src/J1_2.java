/*
 * 학기: 2023년 1학기
 * 과목: Java Programming
 * 과제: J1_2
 * 소속: IT융합자율학부
 * 이름: 박지섭
 * 학번: 202114154
 */
import java.util.Scanner;

public class J1_2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("월을 입력하시오: ");
	int Month = scanner.nextInt();
	
	switch(Month) {
	case 2:
		System.out.println(Month +"월의 일수는 28 or 29입니다.");
		break;
	case 4,6,9,11:
		System.out.println(Month +"월의 일수는 30입니다.");
		break;
	case 1,3,5,7,8,10,12:
		System.out.println(Month +"월의 일수는 31입니다");
		break;
	default:
		System.out.println("잘못된 입력입니다.");
	}
	
	scanner.close();
	}
}
