// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제6
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// lib.Airplane.java

package lib;

// 기존 J5과제에서 J6과제 조건을 추가한 추상 클래스입니다.
public abstract class Airplane {
	// 식별 번호를 나타내는 id 필드(String)입니다.
	private String id;
	// 비행기 타입을 나타내는 type 필드(String)입니다.
	private String type;


	// 객체 생성 시 전달받은 id와 type 값으로 필드를 초기화하는 메소드입니다.
	public Airplane(String id, String type) {
		this.id = id;
		this.type = type;
	}

	// 식별 번호를 설정하는 메소드입니다.
	public void setID(String id) {
		// 식별 번호 setter 메소드입니다.
		this.id = id;
	}

	// 식별 번호를 반환하는 메소드입니다.
	public String getID() {
		// 식별 번호 getter 메소드입니다.
		return id;
	}

	// 비행기 타입을 설정하는 메소드입니다.
	public void setType(String type) {
		// 비행기 타입 setter 메소드입니다.
		this.type = type;
	}

	// 비행기 타입을 반환하는 메소드입니다.
	public String getType() {
		// 비행기 타입 getter 메소드입니다.
		return type;
	}

	// 비행기가 이륙하는 추상 메소드입니다.
	public abstract void takeoff();

	// 비행기가 착륙하는 추상 메소드입니다.
	public abstract void landing();

	// 비행기가 주행하는 추상 메소드입니다.
	public abstract void flight();

	// 식별 번호와 비행기 타입을 출력하는 추상 메소드입니다.
	public abstract void showInfo();
}