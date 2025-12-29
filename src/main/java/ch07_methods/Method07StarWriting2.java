package ch07_methods;

import java.util.Scanner;

public class Method07StarWriting2 {
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
        System.out.println(getStar());
    }


}
