// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제8
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// Airplane.java

// 비행기 기본 정보를 담은 Airplane 클래스
public class Airplane {
	// 식별 번호를 나타내는 id 필드(String)
	private String id;
	// 비행기 제조회사를 나타내는 company 필드(String)
	private String company;
	// 비행기 탑승인원을 나타내는 person 필드(int)
	private int person;

	// 객체 생성 시 전달받은 id, type, company 값으로 필드를 초기화하는 메소드
	public Airplane(String id, String company, int person) {
		this.id = id;
		this.company = company;
		this.person = person;
	}

	// 비행기 제조회사를 반환하는 메소드
	public String getCompany() {
		// 비행기 제조회사 getter 메소드
		return company;
	}

	// 비행기 탑승인원을 반환하는 메소드
	public int getPerson() {
		// 비행기 탑승인원 getter 메소드
		return person;
	}

	// 식별 번호를 반환하는 메소드
	public String getID() {
		// 식별 번호 getter 메소드
		return id;
	}

	// 식별변호, 제조회사, 탑승인원을 출력하는 toString()메소드를 오버라이딩
	@Override
	public String toString() {
		return id + " " + company + " " + person;
	}
}