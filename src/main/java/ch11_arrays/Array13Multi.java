package ch11_arrays;
/*
    다차원 배열(Multi-Dimensional Array) 중에서 2차원 배열
    : 다차원 배열은 2차원 이상의 배열을 의미하지만 개발 환경 상
    2차원 배열 이상을 다루는 경우는 드물기 때문에 2차원 배열을 기준으로 강의.

    형식 :
    int[][] arr01 = new int[크기][크기]; - 선언 방식 #1
    int[][] arr02 = new int[크기][]; - 선언 방식 #2
    int[][] arr03 = {{1, 2}, {3, 4}, {5, 6}} - 선언 방식 #3 및 초기화

    2차원 배열 선언 시, '열'의 크기는 지정하지 않아도 되지만 '행'의 크기는 항상
    지정해야함. -> 2번 방식을 의미합니다.
        1열 2열(column) - 세로줄을 열
    {    ↓  ↓
        {1, 2}, → 1행 (row) - 가로줄을 행
        {3, 4}, → 2행 (row)
        {5, 6}  → 3행 (row)
    }
 */

import java.util.Arrays;

public class Array13Multi {
    public static void main(String[] args) {
        int[][] arr03 = {{1,2}, {3,4}, {5,6}};

        // 5라는 숫자 출력
        System.out.println(arr03[2][0]);
        // 2차 배열은 내부 element가 배열이라는 점에 주목
        System.out.println(arr03); // 결과값 : [[I@36baf30c
        System.out.println(arr03[2]); // 결과값: [I@7a81197d

        System.out.println(Arrays.toString(arr03)); // 결과값: [[I@5ca881b5, [I@24d46ca6, [I@7a81197d]

        // 2차 배열의 element 추츨 -> 중첩 for문을 사용
        for (int i = 0; i < arr03.length; i++) {
            for (int j = 0; j < arr03[i].length; j++) {
                System.out.print(arr03[i][j] + " / ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr03.length; i++) {
            // 1차 배열
            System.out.println(Arrays.toString(arr03[i]));
        }

        //  arr03을 향상된 for문을 통해서 출력
        // 1 - 2 -
        // 3 - 4 -
        // 5 - 6 -


        for (int[] arr1 : arr03) {
            for (int arr2 : arr1) {
                System.out.print(arr2 + " - ");
            }
            System.out.println();
        }
    }
}
