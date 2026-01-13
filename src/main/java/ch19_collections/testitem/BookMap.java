package ch19_collections.testitem;

import java.util.*;

public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookStocks = new HashMap<>();
        String bookName;
        int quantity;

        while (true) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1.도서 추가");
            System.out.println("2.재고 수정");
            System.out.println("3.재고 목록");
            System.out.println("4.종료");
            System.out.print("메뉴를 선택하세요: ");
            int inputNum = scanner.nextInt();

            if (inputNum == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (inputNum == 1) {
                System.out.print("새 도서명을 입력하세요: ");
                scanner.nextLine();
                bookName = scanner.nextLine();
                System.out.print("재고 수량을 입력하세요: ");
                quantity = scanner.nextInt();
                bookStocks.put(bookName, quantity);
                System.out.println(bookName + " 도서가 " + quantity + " 권 추가되었습니다.");
            }

            if (inputNum == 2) {
                System.out.print("재고를 변경할 도서명을 입력하세요: ");
                scanner.nextLine();
                bookName = scanner.nextLine();

                if (!bookStocks.containsKey(bookName)) {
                    System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                    break;
                }

                System.out.print("새로운 재고 수량을 입력하세요: ");
                quantity = scanner.nextInt();
                bookStocks.replace(bookName, quantity);
                System.out.println(bookName + " 도서가 " + quantity + " 권으로 변경되었습니다.");
            }

            if (inputNum == 3) {
                System.out.println("--- 현재 재고 목록 ---");

                for (Map.Entry<String, Integer> entry : bookStocks.entrySet()) {
                    System.out.println("도서명: " + entry.getKey()
                            + ", 재고 수량: " + entry.getValue() + " 권");
                }
                continue;
            }
        }
    }
}
