package ch11_arrays;

import ch10_access_modfier.bank.Bank2;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr01 = {1, 2, 3, 4, 5};
        // 이하의 코드를 실행해봤을 때, 배열 내부의 값을 확인할 수 없습니다.
        // @를 고려 했을 때 주소지만 출력됩니다.
        /*
            현재 배열 내부에 다수의 데이터가 있기 때문에
            콘솔창에서 전체 확인이 불가능합니다.
            즉 element를 확인하기 위해서는 배열 내부로 직접 탐색하는 과정이 필요합니다.
            이때 필요한 개념이 index(주소지) 입니다.
         */
        System.out.println(arr01); // 주소값만 출력됨
        System.out.println(arr01[0]); // 배열명[index]의 형태로 내부 element 확인 가능
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);

        // for문을 통해서 arr01에 있는 내부 요소를 콘솔에 출력하시오.

        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + " ");
        }

        /*
            빈 배열 생성
            자료형1[] 배열명 = new 자료형1[개수];
            얘가 다른 언어에 비해서 골치 아픈게, 미리 방의 개수를 지정을 해줘야합니다.

            이상의 사항을 종합했을 때,
            배열 내부의 방의 개수 / 주소지의 한계값 - 1을 우리가 항상 알고 있는 것은 아니기 때문에
            element 값을 출력하기 위한 한계값을 설정할 때
            배열명.length를 생활화하는 것이 좋습니다.
         */
        System.out.println();
        int[] arr03 = new int[10]; // 10개짜리 방을 가진 비어있는 배열을 생성합니다.
        System.out.println(arr03[0]); // int 로 선언했기 때문에 초기화를 하지 않았다면 0

        // 배열의 특정 index 값을 대입하는 방법
        arr03[0] = 10;
        System.out.println(arr03[0]);

        int[] arr04 = new int[40];
        // 이상의 빈 배열에 41부터 80까지의 값을 순서대로 대입하고
        // 41 / 42 / 43 / ... / 79 / 80 으로 출력될 수 있도록 코드를 작성하시오.

        for (int i = 0; i < arr04.length; i++) {
            arr04[i] = i + 41;
            System.out.print(arr04[i] + " ");
        }
        System.out.println();
        // 비어있는 String 배열을 선언하고 내부 element로 "안" "녕" "하" "세" "요" 로
        // 초기화한 후 안녕하세요 로 콘솔에 출력할 수 있도록 하시오.

        String[] arr05 = {"안", "녕", "하", "세", "요"};
        for (int i = 0; i < arr05.length; i++) {
            System.out.print(arr05[i]);
        }
    }

}
