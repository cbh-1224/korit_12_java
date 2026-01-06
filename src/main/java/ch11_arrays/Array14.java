package ch11_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

        // 1부터 100까지 숫자를 2차 배열에 순서대로 값을 넣으시오.
        // 즉, nums[0][0] = 1, nums[1][0] = 6, nums[1][1] = 7, ....
        // 값을 입력하고 나면
        // 향상된 for문을 통해서
        // 2차 배열 내부로 들어가고ㅓ, Arrays.toString()으로 1부터 100까지를 콘솔에 출력

//        int n = 1;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                nums[i][j] = n++;
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (5 * i) + j + 1;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] number : nums) {
            System.out.println(Arrays.toString(number));
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // 다차원 배열 출력하는 방식
        // Arrays.deepToString(다차원배열명);
        System.out.println(Arrays.deepToString(nums));
    }
}
