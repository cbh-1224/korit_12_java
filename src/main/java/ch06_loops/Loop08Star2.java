package ch06_loops;

import java.util.Scanner;

/*
    Scanner를 이용한 별 찍기

    실행 예
    몇 줄의 별을 생성하시겠습니까? 3
    *
    **
    ***
    로 만들어질 수 있도록 작성하시오.
    다 하신 분들은
    ***
    **
    *
 */
public class Loop08Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성하시겠습니까?: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
