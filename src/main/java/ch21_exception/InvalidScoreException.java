package ch21_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidScoreException extends Exception{
    public InvalidScoreException(String message) {
        super(message);
    }

    public static void checkScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("점수는 0 ~ 100점 사이여야 합니다.");
        }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("점수를 입력하세요: ");
            int score = scanner.nextInt();
            checkScore(score);
            System.out.println("점수가 성공적으로 저장되었습니다.");
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        } finally {
            System.out.println("시스템을 종료합니다.");
        }
    }
}
