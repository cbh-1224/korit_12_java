package ch21_exception;

import lombok.Data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }

    public static void withdraw(int amount) throws InsufficientBalanceException{
        int balance = 10000;
        int result = 0;
        if (amount > balance) {
            result = amount - balance;
            throw new InsufficientBalanceException("잔액이 부족합니다." + "부족금액: " + result + "원");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("출금액을 입력하세요: ");
            int amount = scanner.nextInt();
            withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
