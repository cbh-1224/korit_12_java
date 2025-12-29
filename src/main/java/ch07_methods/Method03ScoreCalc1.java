package ch07_methods;

import java.util.Scanner;

public class Method03ScoreCalc1 {
    // 메서드 정의 영역 - Method02에 있던 기능을 메서드로 정의할겁니다.
    // call1()으로 할겁니다
    public static void calcSumAndAvg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 과목의 점수를 입력하시겠습니까?: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " 과목의 점수를 입력하세요: ");
            double score = scanner.nextDouble();
            sum += score;
        }
        System.out.println("총합은 " + sum + "이며, 평균은 " + (sum / n) + "입니다.");
    }
    public static void main(String[] args) {
        // 메서드 호출 영역
        calcSumAndAvg();
    }
}
