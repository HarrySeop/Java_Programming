// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제5
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭

public class AirplaneTest {
	public static void main(String[] args) {
		// Airliner 객체 생성
		// airliner1 객체: Airliner(String id) 생성자를 호출하여 생성
		Airplane.Airliner airliner1 = new Airplane.Airliner("A100");
		// airliner2 객체: Airliner(String id, int passengersNumber) 생성자를 호출하여 생성
		Airplane.Airliner airliner2 = new Airplane.Airliner("A200", 500);

        // Fighter 객체 생성
		// fighter1 객체: Fighter(String id) 생성자를 호출하여 생성
		Airplane.Fighter fighter1 = new Airplane.Fighter("F300");
		// fighter2 객체: Fighter(String id, boolean stealthMode) 생성자를 호출하여 생성
		Airplane.Fighter fighter2 = new Airplane.Fighter("F400", true);
		
		// setter를 이용하여 airliner1을 실행결과처럼 나오게 데이터 변경
		// airliner1.setPassenger(0);
		// 다만 Airliner(String id)가 탑승 인원수를 0으로 초기화 하므로 주석 처리 했습니다.
		
		// 객체의 데이터 출력
		airliner1.showInfo();
        System.out.println();
        airliner2.showInfo();
        System.out.println();
        fighter1.showInfo();
        System.out.println();
        fighter2.showInfo();
	}
}
