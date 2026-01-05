package ch11_arrays;
/*
    이하의 scores 배열의 값을 탐색하여
    90이상은 A
    80이상은 B
    70이상은 C
    60이상은 D
    59이하는 F

    실행 예
    A 등급 몇 명
    B 등급 몇 명
    ...
    F 등급 몇 명
 */
public class Array07 {

    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (int i = 0; i < scores.length; i++) {

            if(scores[i] > 100 ||scores[i] < 0) {
                break;
            }
            else if (scores[i] > 89) a++;
            else if (scores[i] > 79) b++;
            else if (scores[i] > 69) c++;
            else if (scores[i] > 59) d++;
            else f++;
        }
        System.out.println("A등급 " + a + "명");
        System.out.println("B등급 " + b + "명");
        System.out.println("C등급 " + c + "명");
        System.out.println("D등급 " + d + "명");
        System.out.println("F등급 " + f + "명");
        System.out.println();

        // 풀이법 #2
        int[] grade = {0, 0, 0, 0, 0};

        for (int i = 0; i < scores.length; i++) {

            if(scores[i] > 100 || scores[i] < 0) {
                break;
            }
            else if (scores[i] > 89) grade[0]++;
            else if (scores[i] > 79) grade[1]++;
            else if (scores[i] > 69) grade[2]++;
            else if (scores[i] > 59) grade[3]++;
            else grade[4]++;
        }
        System.out.println("A등급 " + grade[0] + "명");
        System.out.println("B등급 " + grade[1] + "명");
        System.out.println("C등급 " + grade[2] + "명");
        System.out.println("D등급 " + grade[3] + "명");
        System.out.println("F등급 " + grade[4] + "명");
        System.out.println();


    }
}
