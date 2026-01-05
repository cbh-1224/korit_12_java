package ch11_arrays;
/*
    배열을 매개변수로 하는 메소드 정의를 방금 전에 해봤습니다.
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것을 목표로 하겠습니다.
 */
public class Array04 {

    private String[] inputNames() {
        String[] names = {"김일", "김이", "김삼"};
        return names;
    }
    public void printElement() {
        String[] titles = inputNames();
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i] + " / ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array04 array04 = new Array04();
        array04.printElement();

    }
}