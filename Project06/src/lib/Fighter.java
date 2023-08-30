// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제6
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// lib.Fighter.java

package lib;

// Airplane 클래스를 상속받고, Weapon 인터페이스의 메소드를 구현하는 Fighter 클래스입니다.
public class Fighter extends Airplane implements Weapon {
	// 스텔스 모드를 나타내는 stealthMode 필드(boolean)입니다.
	private boolean stealthMode;

	// Fighter 클래스의 생성자입니다.
	public Fighter(String id) {
		// 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "전투기"를 전달합니다.
		super(id, "전투기");
		// 스텔스 모드를 false로 초기화합니다.
		this.stealthMode = false;
	}

	// Fighter 클래스의 생성자입니다.
	public Fighter(String id, boolean stealthMode) {
		// 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "전투기"를 전달합니다.
		super(id, "전투기");
		// 스텔스 모드를 전달받은 값으로 초기화합니다.
		this.stealthMode = stealthMode;
	}

	// 스텔스 모드를 true로 설정하는 메소드입니다.
	public void stealthOn() {
		// 스텔스 모드를 활성화합니다.
		this.stealthMode = true;
	}

	// 스텔스 모드를 false로 설정하는 메소드입니다.
	public void stealthOff() {
		// 스텔스 모드를 비활성화합니다.
		this.stealthMode = false;
	}

	// 스텔스 모드의 상태를 반환하는 메소드입니다.
	public boolean getStealth() {
		// 스텔스 모드 getter 메소드입니다.
		return stealthMode;
	}

	// Airplane 클래스의 메소드를 오버라이딩합니다.
	@Override
	// 슈퍼 클래스(Airplane)의 takeoff() 메소드 호출합니다.
	public void takeoff() {
		System.out.println("전투기 " + getID() + "가 이륙합니다.");
	}

	// Airplane 클래스의 메소드를 오버라이딩합니다.
	@Override
	// 슈퍼 클래스(Airplane)의 landing() 메소드 호출합니다.
	public void landing() {
		System.out.println("전투기 " + getID() + "가 착륙합니다.");
	}

	// Airplane 클래스의 메소드를 오버라이딩합니다.
	@Override
	// 슈퍼 클래스(Airplane)의 flight() 메소드 호출합니다.
	public void flight() {
		System.out.println("전투기 " + getID() + "가 비행합니다.");
	}

	// Airplane 클래스의 메소드를 오버라이딩합니다.
	@Override
	// 슈퍼 클래스(Airplane)의 showInfo() 메소드 호출합니다.
	public void showInfo() {
		System.out.println("식별 번호: " + getID());
		System.out.println("비행기 타입: " + getType());
		System.out.println("스텔스 모드: " + stealthMode);
	}

	// Weapon 인터페이스의 추상 메소드를 오버라이딩합니다.
	@Override
	// 인터페이스(Weapon)의 loadWeapon() 추상 메소드를 호출합니다.
	public void loadWeapon() {
		// 입력받은 비행기의 ID를 가져와서 출력합니다.
		System.out.println(getID() + " 무기 장착");
		// weaponList 배열에 저장된 무기를 장착하기 위해 반복문을 사용합니다.
		for (int i=0;i<weaponList.length;i++) {
			// 0부터 weaponList길이-1 만큼 반복한 후,
			// weaponList 배열의 i번째 요소를 출력 후, 메세지도 추가로 출력합니다.
			System.out.println(weaponList[i] + " 무기가 장착되었습니다.");
		}
	}

	// Weapon 인터페이스의 추상 메소드를 오버라이딩합니다.
	@Override
	// 인터페이스(Weapon)의 showWeapon() 추상 메소드를 호출합니다.
	public void showWeapon() {
		// 입력받은 비행기의 ID를 가져와서 출력합니다.
		System.out.println(getID() + " 무기 목록");
		// weaponList 배열에 저장된 무기를 목록을 보여주기 위해 반복문을 사용합니다.
		for (int i=0;i<weaponList.length;i++) {
			// 무기 번호는 1번부터 시작이기 때문에 i + 1을 해서 번호를 보여주고 목록을 출력합니다.
			System.out.println((i + 1) + ": " + weaponList[i]);
		}
	}

	// Weapon 인터페이스의 추상 메소드를 오버라이딩합니다.
	@Override
	// 인터페이스(Weapon)의 selectWeapon() 추상 메소드를 호출합니다.
	public String selectWeapon(int n) {
		// switch 문을 이용해서 입력받은 무기번호(n)를 비교해서
		// 조건에 맞는 경우 해당하는 무기를 반환합니다.
		switch (n) {
		case 1: {
			// 무기 번호가 1인 경우 weaponList 배열의 0번째 요소를 반환합니다.
			return weaponList[0];
		}
		case 2: {
			// 무기 번호가 2인 경우 weaponList 배열의 1번째 요소를 반환합니다.
			return weaponList[1];
		}
		case 3: {
			// 무기 번호가 3인 경우 weaponList 배열의 2번째 요소를 반환합니다.
			return weaponList[2];
		}
		default:
			// 정의되지 않은 무기 번호인 경우 "others"를 반환합니다.
			return "others";
		}
	}
}