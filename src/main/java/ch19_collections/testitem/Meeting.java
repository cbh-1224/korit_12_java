package ch19_collections.testitem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> meetingAttendees = new HashSet<>();

        while(true) {
            System.out.print("참석자 이름을 입력하세요: ");
            String str = scanner.next();
            meetingAttendees.add(str);

            if (str.equals("종료")) {
                meetingAttendees.remove("종료");
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
        }

        System.out.println("--- 최종 참석자 명단 ---");
        System.out.println(meetingAttendees);
    }

}
