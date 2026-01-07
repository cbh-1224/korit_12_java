package ch13_abstraction.interfaces;
/*
    클래스는 단일 상송만 가능한데, 키워드는 extends
    인터페이스는 다중 상속(구현)이 가능하다. 키워드는 implements
 */
public abstract class Button implements Press, Up, Down{

    @Override
    public void onDown() {} // 일반 메서드 {}가 있으니까. 근데 안에 아무것도 안써놨습니다.

    @Override
    public abstract void onPressed(); // 추상 메서드

    @Override
    public String onUp() {
        return "";
    }
}
