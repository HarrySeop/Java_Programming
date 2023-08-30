// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제6
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// app.AirplaneFight.java

package app;
import lib.Airliner;
import lib.Fighter;
import java.util.Scanner;

public class AirplaneFight {
	public static void main(String[] args) {
		// 사용자에게 입력받은 값을 저장하는 변수 n을 선언하고 초기값을 0을 할당합니다.
		int n = 0;

		// 사용자에게 입력을 받기위한 scanner 객체 생성합니다.
		Scanner scanner = new Scanner(System.in);

		// airliner 객체: Airliner(String id) 생성자를 호출하여 생성합니다.
		Airliner airliner = new Airliner("A100");
		// setter를 이용하여 airliner을 실행결과처럼 나오게 데이터를 변경합니다.
		airliner.setPassenger(300);

		// fighter 객체: Fighter(String id) 생성자를 호출하여 생성합니다.
		Fighter fighter = new Fighter("F300");

		// 객체의 데이터를 출력합니다.
		// 여객기의 정보를 출력합니다.
		airliner.showInfo();
		System.out.println();

		// 여객기의 이륙, 비행, 착륙 동작을 출력합니다.
		airliner.takeoff();
		airliner.flight();
		airliner.landing();
		System.out.println();

		// 전투기의 정보를 출력합니다.
		fighter.showInfo();
		System.out.println();

		// 전투기의 무기 장착을 출력합니다.
		fighter.loadWeapon();
		System.out.println(); 

		// 전투기의 이륙, 비행 동작을 출력합니다.
		fighter.takeoff();
		fighter.flight();

		// 전투기의 무기 목록을 출력합니다.
		fighter.showWeapon();

		System.out.print("무기를 선택하시오: ");
		// 사용자에게 입력받은 값을 n에 저장합니다.
		n = scanner.nextInt();

		// fighter 객체의 selectWeapon을 호출한 뒤,
		// 입력받은 무기 번호(n)을 적용시켜 반환된 값을 sW에 저장합니다.
		String sW =fighter.selectWeapon(n); 

		// "others"와 일치하는 무기 즉, 무기 목록에 정의되지않은 번호를 입력받은 경우,
		// 오류 메세지를 출력하고 다시 무기 번호를 입력받도록 하는 while문 생성합니다.
		while (sW.equals("others")) {
			System.out.println("정의된 번호가 아닙니다. 다시 입력해주세요.");
			System.out.print("무기를 선택하시오: ");
			// 사용자에게 다시 무기 번호를 입력받습니다.
			n = scanner.nextInt();
			// 새로 입력받은 무기 번호를 적용해서 다시 selectWeapon 메소드를 호출,
			// 반환 값을 갱신하여 while 문을 반복합니다.
			sW = fighter.selectWeapon(n);
		}
		// "others"와 일치하지 않는무기 즉, 무기 목록에 정의된 번호를 입력받은 경우,
		// 선택된 무기를 출력한뒤 메세지를 추기로 출력합니다.
		System.out.println(sW + "이 발사되었습니다.");
		System.out.println();

		// 전투기의 착륙 동작을 출력합니다.
		fighter.landing();

		// 스캐너 객체를 닫습니다.
		scanner.close();
	}
}