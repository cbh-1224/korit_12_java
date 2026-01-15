package ch21_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidOrderQuantityException extends Exception{
    public InvalidOrderQuantityException(String message) {
        super(message);
    }

    public static void order(int quantity) throws InvalidOrderQuantityException{
        if (quantity < 1 || quantity > 50) {
            throw new InvalidOrderQuantityException("선택 가능 수량: 1 ~ 50");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("주문 수량 입력: ");
            int quantity = scanner.nextInt();
            order(quantity);
        } catch (InvalidOrderQuantityException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        } finally {
            System.out.println("주문 프로세스 완료");
        }
    }
}
