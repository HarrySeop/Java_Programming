// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제8
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// AirplaneFinder.java
import java.io.*;
import java.util.*;

public class AirplaneFinder {
	// 비행기 식별 정보와 객체를 기록하는 HashMap 컬렉션 생성 (key, value)
	HashMap<String, Airplane> airplaneMap = new HashMap<String, Airplane>();
	Scanner scanner = new Scanner(System.in);
	// airplane.txt 파일로부터 비행기 정보 읽기 기능을 가진 메소드
	public void readAirplaneFile() {
		// airplane.txt에 있는 파일을 한줄씩 읽어와서 효율성을 높히기 위해 BufferedReader를 사용
		FileReader fread = null;
		BufferedReader bread = null;

		try {
			fread = new FileReader("C:\\java\\airplane.txt");
			bread = new BufferedReader(fread);

			String line;
			// 파일의 모든 줄을 읽어옵니다. 한 줄씩 읽으면서 비행기 정보를 추출하여 airplaneMap에 저장합니다.
			while((line = bread.readLine()) != null) {
				// 공백을 기준으로 비행기 정보를 나눕니다.
				String[] airplanesInfo = line.split(" ");
				// 비행기 식별번호, 제조회사, 탑승인원을 추출합니다.
				String id = airplanesInfo[0];
				String company = airplanesInfo[1];
				int person = Integer.parseInt(airplanesInfo[2]);

				// 추출한 정보를 이용하여 Airplane 객체를 생성합니다.
				Airplane airplane = new Airplane(id, company, person);
				// 비행기 식별번호를 key로 하여 Airplane 객체를 airplaneMap에 저장합니다.
				airplaneMap.put(id, airplane);
			}
			// 파일 읽기가 완료되면 BufferedReader와 FileReader를 닫습니다.
			bread.close();
			fread.close();
		}
		catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

	public void writeAirplaneFile() {
		// 파일 쓰기르 위한 FileWriter 객체와 BufferedWriter 객체 선언
		FileWriter fwr = null;
		BufferedWriter bwr = null;
		String answer = null;	// 사용자 입력 값을 저장할 변수

		try {
			// FileWriter 를 이용해서 airplane.txt 파일을 이어쓰기로 열었습니다.
			fwr = new FileWriter("C:\\java\\airplane.txt", true);
			bwr = new BufferedWriter(fwr);

			while (true) {
				System.out.print("새로운 비행기 정보를 입력하시겠습니까? (Y/N): ");
				answer = scanner.nextLine();

				// Y,y를 입력한 경우
				if (answer.equals("Y") || answer.equals("y")) {
					// 사용자에게 입력받기
					System.out.print("비행기 식별번호: ");
					String id = scanner.nextLine();
					System.out.print("비행기 제조회사: ");
					String company = scanner.nextLine();
					System.out.print("비행기 탑승인원: ");
					int person = scanner.nextInt();

					// 새로운 줄로 개행한 후 입력받은 데이터들을 파일에 입력합니다.
					bwr.newLine();
					bwr.write(id + " " + company + " " + person);
					scanner.nextLine();

					System.out.println("");
					//break;

					// N,n을 입력한 경우	
				} else if (answer.equals("N") || answer.equals("n")) {
					System.out.println("");
					// 무한 루프를 끝냅니다.
					break;
				} else {
					System.out.println("잘못된 키값입니다.");
				}
			}
			// 파일 쓰기가 완료되면 FileWriter 객체와 BufferedWriter 객체를 닫습니다.
			bwr.close();
			fwr.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

	public void findAirplane() {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 비행기 식별번호를 입력하세요: ");
		// 사용자로 부터 비행기 식별 번호르 인력 받습니다.
		String search = scanner.nextLine();

		// 입력된 식별번호를 키로 가지는 비행기 객체 조회
		Airplane airplane = airplaneMap.get(search);

		// airplane 객체가 null이 아닌 경우 즉, 비행기 객체가 조회된 경우
		if (airplane != null) {
			// 비행기 정보 출력
			System.out.println(airplane.toString());
			System.out.println("");
		} else {
			System.out.println("존재하지 않는 비행기 식별번호입니다.");
		}
	}

	public static void main(String[] args) {
		// AirplaneFinder 객체 생성
		AirplaneFinder afi = new AirplaneFinder();
		afi.readAirplaneFile();
		afi.findAirplane();
		afi.writeAirplaneFile();
	}
}
