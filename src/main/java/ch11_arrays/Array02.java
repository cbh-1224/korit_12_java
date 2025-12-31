package ch11_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 명의 학생을 등록하시겠습니까?: ");
        int num1 = scanner.nextInt();
        String[] humans = new String[num1];
        for (int i = 0; i < num1; i++) {
            System.out.print((i + 1) + "번 학생의 이름을 등록하세요: ");
            humans[i] = scanner.next();
        }

        System.out.print("몇 명의 학생을 등록하시겠습니까?: ");
        int num2 = scanner.nextInt();
        double[] scores = new double[num2];
        double sum = 0;
        for (int j = 0; j < num2; j++) {
            System.out.print((j + 1) + "번 학생의 이름을 등록하세요: ");
            scores[j] = scanner.nextDouble();
            sum += scores[j];
        }
        System.out.println("학생들의 점수 총합은 " + sum + "점 입니다.");
        scanner.close();
    }
}
