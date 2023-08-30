// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제7
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// Airplane.java

// 비행기 기본 정보를 담은 Airplane 클래스입니다.
public class Airplane {
	// 식별 번호를 나타내는 id 필드(String)입니다.
	private String id;
	// 비행기 타입을 나타내는 type 필드(String)입니다.
	private String type;
	// 비행기 제조회사를 나타내는 company 필드(String)입니다.
	private String company;

	// 객체 생성 시 전달받은 id, type, company 값으로 필드를 초기화하는 메소드입니다.
	public Airplane(String company, String type, String id) {
		this.id = id;
		this.type = type;
		this.company = company;
	}

	// 비행기 제조회사를 반환하는 메소드
	public String getCompany() {
		// 비행기 제조회사 getter 메소드
		return company;
	}

	// 비행기 타입을 반환하는 메소드
    public String getType() {
    	// 비행기 타입 getter 메소드
        return type;
    }

	// 식별 번호를 반환하는 메소드
	public String getID() {
		// 식별 번호 getter 메소드
		return id;
	}
}