package ch11_arrays;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] lottoNums = new int[6];
        int round = 5; // 5 게임으로 가정
//        int[][] lottoNumsSet = new int[round][6];
        int temp = 0;
        int cnt = 0;
        boolean duplicate; // 중복이 되었을때 true로 바꿔서 번호를 뽑을 예정

        for (int j = 0; j < round; j++) {
            for (int i = 0; i < lottoNums.length; i++) {
                duplicate = false; // 초기화
                temp = (int)(Math.random() * 45) + 1;
                // 왜 temp에 넣었냐면 이 변수의 값이 배열 내부의 element값과 다르면 집어넣는 과정을 추가하기 위해
                /*
                    만약 반복문이 진행되어서 i가 3인 상황이라고 가정. 그러면 이전 반복까지 해서
                    0 1 2 번지에 난수가 대입되어있음.
                    그러면 0 1 2 번지의 각각의 int값이 temp의 값과 일치하는지를 확인하고,
                    만약에 일치하지 않으면 -> 3번지에 temp값을 대입
                    일치하는게 있으면 -> 다시 난수 생성 후 temp에 값 대입하고 다시 확인하는 과정을 거쳐야 함
                    이하의 반복문은 3번지라고 가정했을 때 2번지까지의 element 값을 확인하는 부분
                 */
                for (int k = 0; k < i; k++) {
                    if (lottoNums[k] == temp) duplicate = true;
                } // 어쨌든 0 번지부터 i-1번지까지 전체 다 확인을 할 건데 한 번 true로 바뀌면 중복이 되었겠네요
                // 중복이 되면 우리 뭐해야한다? -> 다시 뽑아서 temp에 저장해야한다. 그리고 또 확인해야한다.

                if (!duplicate) lottoNums[i] = temp;
                else i--;
                cnt++;
            }
            System.out.println(Arrays.toString(lottoNums));
            System.out.println("반복 횟수 확인용: " + cnt);
        }
    }
}
