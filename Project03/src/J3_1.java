import java.util.InputMismatchException;
import java.util.Scanner;

public class J3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("행의 개수 입력: ");
		// 행의 개수를 입력받아 RowCount에 저장해 둡니다.
		int RowCount = scanner.nextInt();
		// 입력받은 행의 개수로 2차원 배열 array의 행 크기를 정해줬습니다.
		int[][] array = new int[RowCount][];

		// 행은 0행부터 시작하므로 i를 0부터 RowCount-1개를 해야하니까 i<RowCount로 했습니다.
		for(int i=0;i<RowCount;i++) {
			System.out.print(i + "번 행의 열의 개수 입력: ");
			// 각 행마다 열의 개수를 입력받아 ColCount에 저장해 둡니다.
			int ColCount = scanner.nextInt();
			// 입력받은 열의 개수로 2차원 배열 array의 열의 크기를 정해줬습니다.
			array[i] = new int[ColCount];
		}
		//행과 열의 개수를 입력받고 가시성을 높히기 위해 줄넘김 해줬습니다.
		System.out.println();

		// 입력받은 행의 개수 만큼 for 문을 이용해 반복합니다.
		for (int i=0;i<RowCount;i++) {
			// i번째 행의 열 개수 만큼 반복합니다. 
			for(int j=0; j<array[i].length;j++) {
				// 정수가 아닌 값이 입력받았을 때 다시 입력받게 하기위해 while 문을 이용했습니다.
				while(true) {
					// 입력받는 값을 try-catch문을 이용했습니다.
					try {
						System.out.print("[" + i + "]" + "[" + j + "] " + "입력: ");
						// 정수 값을 입력받아 'array[i][j]'에 저장합니다.
						array[i][j] = scanner.nextInt();
						// 정수 값이 입력되었을 때, while문을 빠져나와 다시 for 문으로 돌아갑니다.
						break;
					}
					// 정수가 아닌 값을 입력했을 때, 예외처리 했습니다.
					catch(InputMismatchException e) {
						System.out.println("정수가 아닌 타입의 값 입니다. 정수를 입력해주세요.");
						// 정수가 아닌 값을 입력했을때 예외처리한 후, 입력버퍼를 비워줘서 다음 입력을 기다리게 해줬습니다.
						scanner.nextLine();
					}
				}
			}
		}
		System.out.println();

		// 배열의 행의 개수만큼 반복합니다.
		for (int i = 0; i < RowCount; i++) {
			// 배열의 열의 개수만큼 반복합니다.
			for (int j = 0; j < array[i].length; j++) {
				// array[i][j]의 배열 값을 공백과 함께 출력합니다.
				System.out.print(array[i][j]+ " ");
			}
			// 교수님 예제 처럼 행별로 개행해줬습니다.
			System.out.println();
		}
		scanner.close();
	}
}
