package ch22_lambda;

import java.util.Arrays;
import java.util.List;

public class forEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("과일명: " + fruits.get(i));
        }
        System.out.println();
        for (String fruit : fruits) {
            System.out.println("과일명: " + fruit);
        }
        System.out.println();
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        System.out.println();
        fruits.stream().map(fruit -> "과일명: " + fruit).forEach(System.out::println);

        System.out.println();
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums); // 원본 확인
        nums.forEach(num -> System.out.print((num*2) + " "));
        System.out.println("\n" + nums); // 마찬가지로 forEach()는 nums라는 list 자체에 종속되어있어서
        // 원본 자체가 변하는 것은 아니다. 각각의 element에 대해 실행문을 적용하는 형태라고 볼 수 있다.


    }
}
