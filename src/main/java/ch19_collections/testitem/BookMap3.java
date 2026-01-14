package ch19_collections.testitem;

import java.util.*;

public class BookMap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java 프로그래밍 입문", 10);
        boolean endOfProgram = false;
        String bookTitle;
        int stock;
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서추가\n2. 입고\n3. 출고\n4. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 :
                    System.out.print("새 도서명을 입력하세요: ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요: ");
                        stock = scanner.nextInt();
                        scanner.nextLine();
                        bookInventory.put(bookTitle, stock);
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2 :
                    System.out.print("입고할 도서명을 입력하세요: ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {

                        System.out.print("입고할 수량을 입력하세요: ");
                        int temp = scanner.nextInt();
                        stock = bookInventory.get(bookTitle) + temp;
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 으로 변경되었습니다.");
                        bookInventory.put(bookTitle, stock);
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.: ");
                    }
                    break;
                case 3 :
                    System.out.print("출고할 도서명을 입력하세요: ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {
                        System.out.print("출고할 수량을 입력하세요: ");
                        int temp = scanner.nextInt();
                        stock = bookInventory.get(bookTitle) - temp;
                        if (temp > stock) {
                            System.out.println("재고가 충분하지 않습니다.");
                            continue;
                        }
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 으로 변경되었습니다.");
                        bookInventory.put(bookTitle, stock);
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 4 :
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

    }
}



