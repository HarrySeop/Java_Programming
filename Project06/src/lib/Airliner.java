// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제6
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// lib.Airliner.java

package lib;

// Airplane 클래스를 상속받는 Airliner 클래스입니다.
public class Airliner extends Airplane {
	// 탑승 인원수를 나타내는 passengersNumber 필드(int)입니다.
    private int passengersNumber;
    
    // Airliner 클래스의 생성자입니다.
    public Airliner(String id) {
    	// 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "여객기"를 전달합니다.
        super(id, "여객기");
     // 탑승 인원수를 0으로 초기화합니다.
        this.passengersNumber = 0;
    }
    
    // Airliner 클래스의 생성자입니다.
    public Airliner(String id, int passengersNumber) {
    	// 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "여객기"를 전달합니다.
    	super(id, "여객기");
    	// 탑승 인원수를 전달받은 값으로 초기화합니다.
    	this.passengersNumber = passengersNumber;
    }
    
    // 탑승 인원수를 설정하는 메소드입니다.
    public void setPassenger(int passengersNumber) {
    	// 탑승 인원수 setter 메소드입니다.
    	this.passengersNumber = passengersNumber;
    }
    
    // 탑승 인원수를 반환하는 메소드입니다.
    public int getPassenger() {
    	// 탑승 인원수 getter 메소드입니다.
        return passengersNumber;
    }
    
    // Airplane 클래스의 메소드를 오버라이딩합니다.
    @Override
    // 슈퍼 클래스(Airplane)의 takeoff() 메소드 호출합니다.
    public void takeoff() {
        System.out.println("여객기 " + getID() + "가 이륙합니다.");
    }

    // Airplane 클래스의 메소드를 오버라이딩합니다.
    @Override
    // 슈퍼 클래스(Airplane)의 landing() 메소드 호출합니다.
    public void landing() {
        System.out.println("여객기 " + getID() + "가 착륙합니다.");
    }

    // Airplane 클래스의 메소드를 오버라이딩합니다.
    @Override
    // 슈퍼 클래스(Airplane)의 flight() 메소드 호출합니다.
    public void flight() {
        System.out.println("여객기 " + getID() + "가 비행합니다.");
    }
    
    // Airplane 클래스의 메소드를 오버라이딩합니다.
    @Override
    // 슈퍼 클래스(Airplane)의 showInfo() 메소드 호출합니다.
    public void showInfo() {
    	System.out.println("식별 번호: " + getID());
    	System.out.println("비행기 타입: " + getType());
        System.out.println("탑승 인원수: " + passengersNumber);
    }
}

