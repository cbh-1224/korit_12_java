package ch11_arrays;

import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입
    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됨 (while문으로 작성하고싶다면 그래도 됨)
 */
public class Array15Lotto {
    public static void main(String[] args) {
        // 일단 1 ~ 45 까지의 임의의 값을 집어넣기 위해 두 가지 방법을 사용할 수 있습니다.
        // # 1 - random.nextInt(45) + 1
        // # 2 - Math.random(): 0 ~ 0.9999999 사이의 임이의 실수를 return
        System.out.println(Math.random()*10 + 1);
        Random random = new Random();
        int[] lottoNumbers = new int[6];



    }
}
