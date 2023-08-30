import java.util.Scanner;

public class J2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Start = 0;
		int End = 0;
		int Multi = 0;
		
		System.out.print("시작: ");
		Start = scanner.nextInt();
		
		System.out.print("종료: ");
		End = scanner.nextInt();
		
		System.out.print("배수: ");
		Multi = scanner.nextInt();
		
		int MultiCount = 0;	// 배수의 개수
		int MultiSum = 0;	// 배수의 합
		int NonMultiSum = 0;// 배수를 제외한 수의 합
		
		// 시작부터 종료까지 i를 반복
		for (int i=Start;i<=End;i++) {
			// i를 입력받은 배수로 나눴을 때 나머지가 0 즉 i가 Multi의 배수라면
			if(i % Multi == 0) {
				//MultiCount를 1 증가시킵니다.
				MultiCount++;
				//MultiSum에 i를 더합니다 ※ Multisum += i;
				MultiSum = MultiSum + i;
			//i가 Multi의 배수가 아니라면	
			}else {
				//NonMultiSum에 i를 더합니다 ※ NonMultiSum += i;
				NonMultiSum = NonMultiSum + i;
			}
		}
		
		 System.out.println(Start + "부터 " + End + "까지 " + Multi + "의 배수의 개수: " + MultiCount);
	     System.out.println(Start + "부터 " + End + "까지 " + Multi + "의 배수에 속하는 수들의 합: " + MultiSum);
	     System.out.println(Start + "부터 " + End + "까지 " + Multi + "의 배수를 제외한 수들의 합: " + NonMultiSum);
		
		scanner.close();
	}
}
