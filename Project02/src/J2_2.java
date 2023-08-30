import java.util.Scanner;

public class J2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 화폐의 단위를 Unit 배열에 저장합니다.
		int[] Unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		// 입력받을 금액을 Money로 선언하고 0으로 초기화합니다.
		int Money = 0;
		// Result는 화폐단위로 나눈 값을 저장하고
		int Result = 0;
		// Remain는 나누고 남은 나머지를 저장합니다.
		int Remain = 0;

		System.out.print("금액을 입력하시오: ");
		// 입력받은 정수값을 Money에 저장합니다.
		Money = scanner.nextInt();
		// for 문을 통해 Unit에 저장한 단위 만큼 반복합니다.
		for(int i=0;i<Unit.length;i++) {
			// Result에는 Money를 현재 화폐단위로 나눈 값을 저장합니다.
			Result = Money / Unit[i];
			// Result값이 0보다 큰 경우 즉, 거스름돈이 생기는 경우는 해당 화폐 단위와 해당 화폐의 갯수를 출력합니다.
			if(Result > 0) {
				System.out.println(Unit[i] + "원 짜리: " + Result + "개");
			}
			// 나머지에는 Money를 현재 화폐 단위로 나누고 남은 값을 저장합니다.
			Remain = Money % Unit[i];
			// Money 변수는 Remain 값으로 갱신되서 다시 for문을 반복 처리합니다.
			Money = Remain;
		}
		scanner.close();
	}
}
