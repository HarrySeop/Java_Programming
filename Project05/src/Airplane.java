// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제5
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭

public class Airplane {
	// 식별 번호를 나타내는 id 필드(String)
    private String id;
    // 비행기 타입을 나타내는 type 필드(String)
    private String type;
    
    
    // 객체 생성 시 전달받은 id와 type 값으로 필드를 초기화하는 메소드
    public Airplane(String id, String type) {
        this.id = id;
        this.type = type;
    }
    
    // 식별 번호를 설정하는 메소드
    public void setID(String id) {
    	// 식별 번호 setter 메소드
        this.id = id;
    }
    
    // 식별 번호를 반환하는 메소드
    public String getID() {
    	// 식별 번호 getter 메소드
        return id;
    }
    
    // 비행기 타입을 설정하는 메소드
    public void setType(String type) {
    	// 비행기 타입 setter 메소드
        this.type = type;
    }
    
    // 비행기 타입을 반환하는 메소드
    public String getType() {
    	// 비행기 타입 getter 메소드
        return type;
    }
    
    // 식별 번호와 비행기 타입을 출력하는 메소드
    public void showInfo() {
        System.out.println("식별 번호: " + id);
        System.out.println("비행기 타입: " + type);
    }

    // Airplane 클래스를 상속받는 Airliner 클래스
    public static class Airliner extends Airplane {
    	// 탑승 인원수를 나타내는 passengersNumber 필드(int)
        private int passengersNumber;
        
        // Airliner 클래스의 생성자
        public Airliner(String id) {
        	// 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "여객기"를 전달
            super(id, "여객기");
         // 탑승 인원수를 0으로 초기화
            this.passengersNumber = 0;
        }
        
        // Airliner 클래스의 생성자
        public Airliner(String id, int passengersNumber) {
        	// 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "여객기"를 전달
        	super(id, "여객기");
        	// 탑승 인원수를 전달받은 값으로 초기화
        	this.passengersNumber = passengersNumber;
        }
        
        // 탑승 인원수를 설정하는 메소드
        public void setPassenger(int passengersNumber) {
        	// 탑승 인원수 setter 메소드
        	this.passengersNumber = passengersNumber;
        }
        
        // 탑승 인원수를 반환하는 메소드
        public int getPassenger() {
        	// 탑승 인원수 getter 메소드
            return passengersNumber;
        }
        
        // Airplane 클래스의 메소드를 오버라이딩
        @Override
        // 슈퍼 클래스(Airplane)의 showInfo() 메소드 호출
        public void showInfo() {
        	// 슈퍼 클래스(Airplane)의 showInfo() 메소드 호출하여 식별 번호와 비행기 타입 출력
            super.showInfo();
            // 탑승 인원수 출력
            System.out.println("탑승 인원수: " + passengersNumber);
        }
    }
    
 // Airplane 클래스를 상속받는 Fighter 클래스
    public static class Fighter extends Airplane {
    	// 스텔스 모드를 나타내는 stealthMode 필드(boolean)
        private boolean stealthMode;

        // Fighter 클래스의 생성자
        public Fighter(String id) {
        	// 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "전투기"를 전달
            super(id, "전투기");
            // 스텔스 모드를 false로 초기화
            this.stealthMode = false;
        }

        // Fighter 클래스의 생성자
        public Fighter(String id, boolean stealthMode) {
            // 슈퍼 클래스(Airplane)의 생성자 호출하여 전달받은 id와 "전투기"를 전달
        	super(id, "전투기");
        	// 스텔스 모드를 전달받은 값으로 초기화
            this.stealthMode = stealthMode;
        }

        // 스텔스 모드를 true로 설정하는 메소드
        public void stealthOn() {
        	// 스텔스 모드를 활성화
            this.stealthMode = true;
        }

        // 스텔스 모드를 false로 설정하는 메소드
        public void stealthOff() {
        	// 스텔스 모드를 비활성화
            this.stealthMode = false;
        }

        // 스텔스 모드의 상태를 반환하는 메소드
        public boolean getStealth() {
        	// 스텔스 모드 getter 메소드
            return stealthMode;
        }
        
        // Airplane 클래스의 메소드를 오버라이딩
        @Override
        // 슈퍼 클래스(Airplane)의 showInfo() 메소드 호출
        public void showInfo() {
        	// 슈퍼 클래스(Airplane)의 showInfo() 메소드 호출하여 식별 번호와 비행기 타입 출력
            super.showInfo();
            // 스텔스 모드 출력
            System.out.println("스텔스 모드: " + stealthMode);
        }
    }
}