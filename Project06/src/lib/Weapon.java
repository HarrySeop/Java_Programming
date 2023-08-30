// 3학년 1학기
// Java Programming
// [Java프로그래밍] 과제6
// 컴퓨터공학, 소프트웨어학과 복수전공
// 202114154
// 박지섭
// lib.Weapon.java

package lib;

// 추상 메소드들을 정의하는 Weapon 인터페이스 입니다.
public interface Weapon {
	// 무기 목록을 담고 있는 배열입니다.
    String[] weaponList = {"미사일", "레이저", "폭탄"};

    // 무기를 장착하는 추상 메소드입니다.
    void loadWeapon();

    // 무기 목록을 보여주는 추상 메소드입니다.
    void showWeapon();

    // 무기를 선택하는 추상 메소드입니다.
    // 매개변수로 전달받은 무기 번호(n)에 따라 해당하는 무기를 반환합니다.
    String selectWeapon(int n);
}