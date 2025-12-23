package ch06_loops;
/*
    중첩 while문(Nested -while)
    혁식:
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }
    1일차 1교시입니다.
    ...
    1일차 3교시입니다.
    ...
    5일차 1교시입니다.
    ...
    5일차 3교시입니다.
 */
public class Loop03While2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while (i < 5) {
            i++;

            while(j < 3) {
                j++;
                System.out.println(i + "일차" + j + "교시입니다.");
            }
            j = 0;
        }

      }
    }

