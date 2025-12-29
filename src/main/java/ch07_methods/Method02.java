package ch07_methods;

import java.util.Scanner;

/*
    지시 사항
    3개 과목의 점수를 입력 받아서, 총합과 평균 점수를 콘솔창에 표시하시오.

    실행 예
    몇 과목의 점수를 입력하시겠습니까?: 3
    1 과목의 점수를 입력하세요: 100
    2 과목의 점수를 입력하세요: 90
    3 과목의 점수를 입력하세요: 95
    총합은 285.0이며, 평균은 95.0입니다.
 */
public class Method02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 과목의 점수를 입력하시겠습니까?: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " 과목의 점수를 입력하세요: ");
            double score = scanner.nextDouble();
            sum += score;
        }
        System.out.println("총합은 " + sum + "이며, 평균은 " + (sum / 3) + "입니다.");
    }
}
