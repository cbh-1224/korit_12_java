package ch12_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석","남궁성");
        book1.showInfo();

        Ebook ebook1 = new Ebook("스프링 입문", "이강준", 5.2, "EPUB");

        ebook1.setFormat("PDF");
        System.out.println("이 전자책의 포맷은 " + ebook1.getFormat() + "입니다.");

        ebook1.showInfo();

    }
}
