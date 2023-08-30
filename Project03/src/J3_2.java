import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class J3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 학생 3명의 점수를 입력 받아야하므로 크기가 3인 Score 배열을 만들어줬습니다.
		int[] Score = new int[3];

		// J3_1과 같이 3명의 점수를 입력받는 for 문입니다
		// 정수를 입력 받으면 try문을 이용하고 break해서 while문을 빠져나와 for 문을 반복합니다.
		// 정수가 아닌 값을 입력받으면 catch문을 이용해서 예외 처리 한 후, 입력 버퍼를 초기화 해줬습니다.
		for(int i=0;i<3;i++) {
			while(true) {
				try {
					System.out.print("점수 입력: ");
					Score[i] = scanner.nextInt();
					break;
				} catch(InputMismatchException e) {
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					scanner.nextLine();
				}
			}
		}
		scanner.close();

		// Arrays 클래스를 이용해서 Score에 저장된 정수 값을 오름차순으로 정리해줬습니다.
		Arrays.sort(Score);

		// 오름차 순이기 때문에 높은 등수는 마지막 배열 값을 출력 해줬습니다.
		// 내림차순으로 정렬 하는 것은 아직 이해를 못하겠어서 오름차 순으로 정리 후 반대로 출력해줬습니다.
		System.out.println("1등: " + Score[2] + "점");
		System.out.println("2등: " + Score[1] + "점");
		System.out.println("3등: " + Score[0] + "점");

	}
}
