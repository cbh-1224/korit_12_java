package ch06_loops;

import java.util.Scanner;

public class Loop05For2 {
    public static void main(String[] args) {
        // 1부터 100까지의 숫자 중 홀수 합만 구하는 for문을 작성하시오.
        // 힌트 #1: for문 내에 if가 들어갈 수 있음.
        // 힌트 #2: 근데 if문 안쓰고도 홀수 합만을 구하는 것이 가능하긴 함.

        int sum = 0;
        for(int i = 0; i < 100; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
        // 힌트 #3: 두 번째 방식을 풀이할 때 굳이 i++로 1씩 증가되어야 하는가.
        int sum1 = 0;
        for(int j = 0; j < 100; j +=2) {
            sum1 += j + 1;
        }
        System.out.println(sum1);

        /*
            여러분들이 숫자 관련 변수 볼 때 i를 보는 경우가 많습니다.
            i는 index의 축약어로 쓰입니다. 그 뒤 알파벳 j, k ...으로 중첩 반복문에서 변수명으로 선호되는 편

            숫자를 입력 받아서 1부터 n까지 더 하는 반복문을 작성하겠습니다.
            실행 예
            1부터 몇 까지 더 하시겠습니까?: 10
            1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum2 = 0;
        for (int k = 0; k < n + 1; k++) {
            sum2 += k;
        }
        System.out.println(sum2);

        int sum4 = 0;
        sum4 = ((n * (n+1) / 2));
        System.out.println(sum4);
    }
}
