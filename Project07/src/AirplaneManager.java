// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제7
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// AirplaneManager.java

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 비행기 식별번호 생성과 비행기 정보 출력 등의 기능을 구현한 AirplaneManager 클래스
public class AirplaneManager {
	// Airplane 객체를 저장할 ArrayList 인 AirplaneList를 생성합니다
	private ArrayList<Airplane> AirplaneList = new ArrayList<>();
	// 계수번호를 나타내는 변수인 registerOrder를 선언하고 초기값으로 0을 할당합니다 
	private int registerOrder = 0;
	
	// 사용자에게 입력을 받기위한 scanner 객체 생성합니다.
	// regist 메소드 안에 선언 했을 때 스캐너를 닫을 수 없는 경고가 나타나서
	// AirplaneManager 클래스에 선언 해 줬습니다.
	Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		// AirplaneManager 객체인 manager를 생성합니다.
		AirplaneManager manager = new AirplaneManager();
		
		// 조건에 맞게 3개의 Aireplane 객체를 나타나게합니다.
		for (int i = 0; i < 3; i++) {
			// 비행기 등록 메소드 호출
			manager.regist();
		}
		// 등록된 비행기 정보를 출력하는 메소드 호출
		manager.showAll();
	}

	// 비행기 등록 기능을 하는 regist 메소드
	public void regist() {

		// 계수번호를 1 증가 시킵니다.
		registerOrder++;
		
		System.out.println("=== 아래 정보를 입력하세요. ===");
		System.out.print("비행기 제조회사: ");
		// 사용자로부터 비행기 제조회사를 입력받습니다.
		String company = scanner.nextLine();
		System.out.print("비행기 타입정보: ");
		// 사용자로부터 비행기 타입정보를 입력받습니다.
		String type = scanner.nextLine();
		System.out.println();

		// 입력받은 제조회사와 타입정보로 식별번호를 생성합니다.
		String id = generateID(company, type);
		// 입력받은 정보로 비행기 객체를 생성합니다.
		Airplane airplane = new Airplane(company, type, id);
		// 생성한 비행기 객체를 AirplaneList에 추가합니다.
		AirplaneList.add(airplane);
		
	}
	
	// 제조회사, 타입정보, 계수번호로 구성된 식별정보 계산 기능을 가진 generateID 메소드
	public String generateID(String company, String type) {
		String CompanyLogo;
		String TypeInfo;

		// 비행기 제조회사가 "아시아나"인 경우 CompanyLogo에 "A"를 할당합니다.
		if (company.equals("아시아나")) {
			CompanyLogo = "A";
		}
		// 비행기 제조회사가 "대한항공"인 경우 CompanyLogo에 "K"를 할당합니다.
		else if (company.equals("대한항공")) {
			CompanyLogo = "K";
		}
		// 그 외의 경우 CompanyLogo에 "Z"를 할당합니다.
		else {
			CompanyLogo = "Z";
		}

		// 비행기 타입이 "여객기"인 경우 TypeInfo에 "L"을 할당합니다.
		if (type.equals("여객기")) {
			TypeInfo = "L";
		} 
		// 비행기 타입이 "전투기"인 경우 TypeInfo에 "F"을 할당합니다.
		else if (type.equals("전투기")) {
			TypeInfo = "F";
		} 
		// 그 외의 경우 TypeInfo에 "Z"를 할당합니다.
		else {
			TypeInfo = "Z";
		}

		// 제조회사 약자 + 타입정보 약자 + 계수번호(%3d를 사용해 3자리 숫자)를 반환합니다.
		return CompanyLogo + TypeInfo + String.format("%03d", registerOrder);
	}

	// 전체 비행기 정보 출력 기능을 포함한 showAll 메소드
	public void showAll() {
		// AirplaneList의 요소를 순회하기 위한 iterator를 생성합니다.
		Iterator<Airplane> iterator = AirplaneList.iterator();

		// iterator가 다음 요소를 가지고 있는지 확인합니다. 즉, AirplaneList 객체의 끝까지 반복합니다.
		while (iterator.hasNext()) {
			// 다음 비행기 객체를 airplane 변수에 할당합니다.
			// iterator.next() 다음 요소를 가져오는 메소드 입니다.
			Airplane airplane = iterator.next();
			// airplane 메소드를 호출하여 제조회사, 타입정보, 식별변호(계수번호)를 가져옵니다.
			System.out.println("------------------------");
			System.out.println("비행기 제조회사: " + airplane.getCompany());
			System.out.println("비행기 타입정보: " + airplane.getType());
			System.out.println("비행기 식별번호: " + airplane.getID());
		}
	}
	
}
