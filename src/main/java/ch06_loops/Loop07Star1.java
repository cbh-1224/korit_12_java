package ch06_loops;
/*
    Nested for - loop
    for(시작값; 한계값; 증감값) {
        반복실핸문1-a
        for(시작값: 한계값; 증감값) {
            반복실행문2
        }
        반복실행문1-b
        for(시작값: 한계값; 증감값) {
            반복실행문3
        }
        반복실행문1-c
    }
    *          고려 사항
    **         반복이 몇 번 일어나는가?
    ***        무엇을 기준으로 반복이 이러우진다고 판단할 수 있나?
    ****       각 라인마다 별의 개수가 달라진다면 어떻게 통제해야 하는가?
    *****
 */
public class Loop07Star1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        /*
            *****
            ****
            ***
            **
            *
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
