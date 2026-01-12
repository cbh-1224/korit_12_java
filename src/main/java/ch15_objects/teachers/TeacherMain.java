package ch15_objects.teachers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        System.out.println(teacher1);
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1); // false 재정의 후 true

        /*
            이상의 코드에서 중요한 점은 재정의 전과 후가 결과값이 다르다.
            Teacher에서 .equals()를 재정의하기 전에는 false
            그때는 teacher1와 teacher2의 주소지까지 확인하여 같은지 아닌지 여부 확인
            재정의 이후에는 field에 입력된 데이터가 동일한지만을 체크
         */

        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        System.out.println(tClass.getSimpleName());

        Field[] fields = tClass.getDeclaredFields();
        // 배열
        System.out.println(fields); // 주소값
        // 두 가지 방법으로 field 확인 가능 1. 반복문 2. Arrays

        for (int i = 0; i < fields.length; i++) {
            System.out.println("필드명 출력: " + fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력: " + fields[i].getType());
            System.out.println("클래스명 출력: " + fields[i].getType().getSimpleName() + "\n");
        }
        // 이상에서 클래스 명에서 주의할 것은 Teacher라는 원본의 자료형이 아니라 field의 자료형을 의미합니다.
        System.out.println(Arrays.toString(fields));

        Method[] methods = tClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {
            System.out.println("매서드명 출력: " + method.getName());
            System.out.println("리턴타입 출력: " + method.getReturnType() + "\n");
        }
        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("안근수", "코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2); // false

        /*
            teacher3의 자료형은 ch15_objects.Teacher이지
            ch15_objects.teachers.Teacher가 아니기 때문에 내부에 동일한 값이 들어가 있다고 하더라도 false
         */
    }
}
