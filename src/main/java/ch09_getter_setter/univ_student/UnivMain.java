package ch09_getter_setter.univ_student;

public class UnivMain {
    public static void main(String[] args) {
        UniveStudent2 univeStudent1 = new UniveStudent2();
        UniveStudent2 univeStudent2 = new UniveStudent2();
        UniveStudent2 univeStudent3 = new UniveStudent2();
        UniveStudent2 univeStudent4 = new UniveStudent2();
        UniveStudent2 univeStudent5 = new UniveStudent2();

        univeStudent1.setName("김일");
        univeStudent2.setName("김이");
        univeStudent3.setName("김삼");
        univeStudent4.setName("김사");
        univeStudent5.setName("김오");

        univeStudent1.setGrade(1);
        univeStudent2.setGrade(3);
        univeStudent3.setGrade(5);
        univeStudent4.setGrade(4);
        univeStudent5.setGrade(2);

        univeStudent1.setScore(3.3);
        univeStudent2.setScore(-30);
        univeStudent3.setScore(2.7);
        univeStudent4.setScore(3.8);
        univeStudent5.setScore(1.0);

        univeStudent1.showInfo();
        univeStudent2.showInfo();
        univeStudent3.showInfo();
        univeStudent4.showInfo();
        univeStudent5.showInfo();

        // 생성자 내부에 로직을 작성한 예시
        UniveStudent2 univeStudent6 = new UniveStudent2("김육", 1, -100);
        System.out.println(univeStudent6.getName()); // 김육
        System.out.println(univeStudent6.getGrade()); // 1
        System.out.println(univeStudent6.getScore()); // 0.0

    }
}
