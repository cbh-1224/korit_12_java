package ch10_access_modfier;
// 이하의 클래스는 default가 생략
class AccessModifierExample { // 간판 클래스는 public이 명시돼야 함.
    // field 선언  - 필드긴 한데, 선언 및 초기화
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {
        return privateVar;
    }
}

public class Main {
    public static void main(String[] args) {
        // 객체 생성 : default class니까 객체 생성이 가능
        AccessModifierExample example = new AccessModifierExample();
        // field를 조회하겠습니다.
        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defaultVar);
//        System.out.println(example.privateVar); // private 접근 제어자이기 때문에 오류 발생합니다. field의 직접 조회 불가능
        System.out.println(example.getPrivateVar());

    }
}
