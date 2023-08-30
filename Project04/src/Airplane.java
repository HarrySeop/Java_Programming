// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제4
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭

public class Airplane {
	
	// model, company, number를 나타내는 3개의 필드를 갖습니다.
    private String model;
    private String company;
    private int number;

    // 비행기 모델과 비행기 회사를 빈 문자열("")로, 탑승 인원수를 0으로 초기화하는 생성자
    public Airplane() {
        this.model = "";
        this.company = "";
        this.number = 0;
    }

    // 비행기 모델을 model로, 비행기 회사를 company로 초기화하는 생성자
    public Airplane(String model, String company) {
        this.model = model;
        this.company = company;
        this.number = 0;
    }

    // 비행기 모델을 model로, 비행기 회사를 company로, 탑승 인원수를 number로 초기화하는 생성자
    public Airplane(String model, String company, int number) {
        this.model = model;
        this.company = company;
        this.number = number;
    }

    // 비행기 모델을 설정하는 메소드
    public void setModel(String model) {
    	// 비행기 모델 setter 메소드
        this.model = model;
    }

    // 비행기 회사를 설정하는 메소드
    public void setCompany(String company) {
    	// 비행기 회사 setter 메소드
        this.company = company;
    }

    // 탑승 인원수를 설정하는 메소드
    public void setNumber(int number) {
    	// 탑승 인원수 setter 메소드
        this.number = number;
    }

    // 비행기 모델을 반환하는 메소드
    public String getModel() {
    	// 비행기 모델 getter 메소드
        return this.model;
    }

    // 비행기 회사를 반환하는 메소드
    public String getCompany() {
    	// 비행기 회사 getter 메소드
        return this.company;
    }

    // 탑승 인원수를 반환하는 메소드
    public int getNumber() {
    	// 탑승 인원수 getter 메소드
        return this.number;
    }

    // 위에 정의한 메소드를 활용하여 비행기 모델, 비행기 회사, 탑승 인원수 정보를 출력하는 메소드
    public void showAirplane() {
        System.out.println("비행기 모델: " + this.model);
        System.out.println("비행기 회사: " + this.company);
        System.out.println("탑승 인원수: " + this.number);
        //System.out.println("비행기 모델: " + this.getModel());
        //System.out.println("비행기 회사: " + this.getCompany());
        //System.out.println("탑승 인원수: " + this.getNumber());
        //주석대로 작성하는게 더 정확하게 하는 방법이다.

    }
}