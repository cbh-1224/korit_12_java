package ch21_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidIdException extends Exception{
    public InvalidIdException(String message) {
        super(message);
    }

    public static void checkId (String id) throws InvalidIdException{
        if (id.length() < 8) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("아이디를 입력하세요: ");
            String id = scanner.nextLine().replace(" ", "");
            checkId(id);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
