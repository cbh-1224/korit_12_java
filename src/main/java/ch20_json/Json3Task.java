//package ch20_json;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.*;
//
//@Data
//@AllArgsConstructor
////class Book {
////    private long bookid;
////    private String title;
////    private String author;
////    private List<String> categories;
////}
//
//public class Json3Task {
//    public static void main(String[] args) {
//
//        Book book1 = new Book(101, "자바 마스터", "안선생", Arrays.asList("프로그래밍", "컴퓨터공학"));
//        Book book2 = new Book(102, "파이썬 입문", "김철수", Arrays.asList("데이터분석"));
//        System.out.println("---- 미션2 출력 ----");
//        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
//        String book3 = gsonBuilder.toJson(book1);
//        System.out.println(book3);
//
//        System.out.println("---- 미션3 출력 ----");
//        Map<String, Object> bookMap1 = gsonBuilder.fromJson(book3, Map.class);
//        System.out.println("도서 제목: " + bookMap1.get("title"));
//
//        System.out.println("---- 미션4 출력 ----");
//        List<Book> bookList1 = new ArrayList<>();
//        List<Book> bookList2 = new ArrayList<>();
//        bookList1.add(book1);
//        bookList2.add(book2);
//
//        String[] jsonData1 = new String[2];
//        jsonData1[0] = gsonBuilder.toJson(bookList1);
//        jsonData1[1] = gsonBuilder.toJson(bookList2);
//
//        System.out.println(Arrays.toString(jsonData1));
//
//
//
//
//
//
//    }
//}
