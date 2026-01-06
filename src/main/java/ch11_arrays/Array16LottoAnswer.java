package ch11_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array16LottoAnswer {
    public static void main(String[] args) {
        // 일단 로또 한 게임을 완성하기 위해서는 6번 반복이 일어나야 합니다
        int[] lottoNums = new int[6];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < lottoNums.length; i++) {
                lottoNums[i] = (int)(Math.random()*45 + 1);
            }
            Arrays.sort(lottoNums);
            System.out.println(Arrays.toString(lottoNums));
        }
        System.out.println();
        // 2차원 배열
        int[][] lotto = new int[5][6];

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto[i].length; j++) {
                lotto[i][j] = (int)(Math.random() * 45) + 1;
            }
            System.out.println(Arrays.toString(lotto[i]));
        }
    }

}
