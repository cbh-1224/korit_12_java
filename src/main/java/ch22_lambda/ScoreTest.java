package ch22_lambda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(23,1657,2654,9403,59,68,1,5,67,4,3,56);
                scores.stream() // StreamAPI 사용
                .filter(s -> s >= 60) // 60점 미만 제거
                .map(s -> s + 5) // 남아있는 숫자에 + 5점
                .sorted() // 오름차순
                .forEach(System.out::println); // 각각 출력

    }
}
