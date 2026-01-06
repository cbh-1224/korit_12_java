package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array12 {
    public static void main(String[] args) {
        // 사용할 객체 생성
        Random random = new Random();
        // 사용할 변수 선언
        Integer[] numbers = new Integer[10];
        // 배열 내에 값 대입 -> 반복문 // 값을 입력하는 것이기 때문에
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        // 출력
        System.out.println(Arrays.toString(numbers));
        int randomNum = random.nextInt(10);
        System.out.println(randomNum);
        /*
            random.nextInt();
            argument가 없을 때는 가장작은 정수부터 가장 큰 정수(int 범위 내)
            중 하나를 임의 생성함
            random.nextInt(한계값);
            arguement가 하나 있을 때는 한계값을 설정합니다. 근데 0을 포함하기 때문에
            random.nextInt(10);이라면 0 ~ 9까지의 범위에서 생성
         */
        // 오름차순
        Arrays.sort(numbers); // 원본 배열을 바꾸기 때문에 주의 - void
        System.out.println(Arrays.toString(numbers));
        // 내림차순
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        /*
            1부터 100까지의 값을 입력 후 10씩 곱하고
            향상된 for문을 통해 10 / 120 / 79 / ... / 로 출력될 수 있도록 코드를 작성
         */
        for (Integer number : numbers) {
            number = random.nextInt(10) + 1;
            number *= 10;
            System.out.print(number + " / ");
        }
    }
}
