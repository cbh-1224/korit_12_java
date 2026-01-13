package ch19_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {

        // Array와의 차이점 #1
        // 선언 방식
        String[] strArray = new String[5]; // 배열 선언 및 초기화
        List<String> strList = new ArrayList<>(); // List선언 방식 및 초기화

        // Array와의 차이점 #2 - 값을 대입하는 방법
        // 배열
        strArray[0] = "김영";
        strArray[4] = "김사";

        // List
        strList.add("Java");
        strList.add("python");
        strList.add("JavaScript");
        strList.add("C#");
        strList.add("C++");
        // 순서가 보장되어 있기 때문에 순서대로 값이 들어간다.
        // 방의 개수를 정하지 않기 때문에 알아서 방이 늘어난다.

        // Array와의 차이점 #3 - 출력 방식
        // strArray를 출력
        System.out.println(Arrays.toString(strArray));
        // List의 출력
        System.out.println(strList);

        // Array와의 차이점 #4 - 삭제 방식
        strArray[0] = null;
        // list는 인덱스 넘버가 고정이지 않다.
        String removeElem1 = "JavaScript";
        boolean isRemoved = strList.remove(removeElem1);
        System.out.println(removeElem1 + " 삭제 여부 : " + isRemoved);
        System.out.println(strList);
        // 이상의 경우 차이점 Array의 경우 null값 대입
        // 0번지가 null이고 여전히 5개짜리 방을 가지고 있습니다.
        // 근데 List의 경우 4개짜리로 줄어듬

        // 정렬 방법
        // 배열은 Arrays.sort
        // 오름차순
        Collections.sort(strList);
        System.out.println(strList);
        // 내림차순
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println(strList);

        /*
            특정 element의 검색(list 내의) -> .contains() 메서드 사용.
            리스트명.contains(목적어)
         */
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem2 + " 포함 여부 : " + contains2);
        /*
            이상의 이유는 list는 element가 명확하게 일치하는 지를 확인합니다
            그래서 py는 python이라는 String 데이터의 일부이기는 하지만 element 전체를
            의미하는 것은 아니기 때문에 false 결과값이 나오게 됩니다.
         */

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "김" + i;
            System.out.print(strArray[i] + " ");
        }
        System.out.println();
        for (String array : strArray) {
            System.out.print(array + " ");
        }
        System.out.println();

        //list는 index 추출할 때 리스트명.size()를 씁니다.

        // 그러면 일반 for문으로 strList를 Java 언어 / python 언어 ... 등으로 출력
        // 향상된 for문 Java 공부 / python 공부 /

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " 언어 / ");
        }
        System.out.println();
        for (String str : strList) {
            System.out.print(str + " 공부 / ");
        }
        System.out.println();
        /*
            이상의 경우에서 배열일 때는 구경도 못하는 향상된 for문의 장점이 있는데
            내부의 index 지정을 .length를 쓰는지 .size()를 쓰는지 등을 고려하지 않아도
            된다는 점과, 출력할 때 [] 인덱스 넘버를 사용해야하는지 .get()을 사용해야하는지
            여부 등을 따지지 않아도 된다는 점입니다,
         */
    }
}
