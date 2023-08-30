// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제4
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭

// Airplane 클래스로부터 아래 세 개의 비행기 객체를 생성하고 showAirplane() 메소드로 비행기 정보를 출력한다.
public class AirplaneOperation {
    public static void main(String[] args) {
    	// plane1 객체: Airplane() 생성자를 호출하여 생성
        Airplane plane1 = new Airplane();
        
        // plane2 객체: Airplane(String model, String company) 생성자를 호출하여 생성
        Airplane plane2 = new Airplane("K300", "코리아나");
        
        // plane3 객체: Airplane(String model, String company, int number) 생성자를 호출하여 생성
        Airplane plane3 = new Airplane("S200", "성공회에어", 500);

        
        // setter를 이용하여 plane1을 실행결과처럼 나오게 데이터 변경
        plane1.setModel("A100");
        plane1.setCompany("아시아나");
        plane1.setNumber(300);
        
        // setter를 이용하여 plane2을 실행결과처럼 나오게 데이터 변경
        plane2.setNumber(400);
        
        // 과제를 잘 이해하지 못해서 객체를 3개를 만든 후, setter 메소드를 이용해서 데이터를 변경해서
        // 실행 결과처럼 나오게 만들었습니다. 
        
        // 객체의 데이터 출력
        plane1.showAirplane();
        System.out.println();
        plane2.showAirplane();
        System.out.println();
        plane3.showAirplane();
    }
}