package ch07_methods;

import java.util.Scanner;

public class Method08StarWriting3 {
    public static String getStar() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성하시겠습니까?: ");
        rowOfStars = scanner.nextInt();
        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까?: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < rowOfStars; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < rowOfStars; i++) {
                    for (int j = 0; j < (rowOfStars - i) - 1; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < rowOfStars; i++) {
                    for (int j = 0; j < rowOfStars - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < rowOfStars; i++) {
                    for (int j = 0; j < i; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < rowOfStars - i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                result = "불가능한 메뉴 선택입니다. 1 - 4의 정수만 입력해주세요.";
        }
        return result;
    }

    public static void main(String[] args) {
        // getStar() 메서드가 2번 실행될 수 있도록 반복문을 작성하시오.
        // 1. for문으로 하나
        // 2. while문으로 하나

//        for (int i = 0; i < 2; i++) {
//            System.out.println(getStar());
//        }
//        int j = 0;
//        while(j < 2) {
//            System.out.println(getStar());
//            j++;
//        }

        // while문의 경우 횟수를 고정시키기 보다는 특정 조건에 맞춰서 진행된다고 했습니다.
        // 그 부분에 대한 예시입니다.
        boolean continued = true;
        while(continued) {
            System.out.println(getStar());
            System.out.print("계속하시겠습니까? Yes면 1, 아니면 0을 선택하세요: ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    break;
                case 0:
                    continued = !continued;
                    break;
                default:
                    System.out.println("불가능한 선택입니다. 0과 1중에 선택해주세요.");
                    continued = !continued;
            }
        }

    }
}
