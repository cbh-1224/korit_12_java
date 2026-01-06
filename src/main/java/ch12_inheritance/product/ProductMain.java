package ch12_inheritance.product;

public class ProductMain {
    public static void main(String[] args) {
        /*
            Item 클래스 건드리지말고 getter 이용해서 다음과 같은 출력문이 나오도록 작성
            이 상품은 일반 상품입니다.
            이 상품은 일반 카테고리입니다.
            System.out.println("이 상품은 일반 상품입니다.");
         */

        /*
            Product 클래스의 인스턴스인 product1을 생성하는데
            이름 -> 전자제품
            카테고리 -> 가전 제품
            가격 -> 10000
            재고 -> 10 으로 생성
            setter 이용해서 가전 제품을 백색 가전 제품으로 바꾸고,
            getter를 활용하여 해당 제품은 백색 가전 제품입니다. 콘솔에 출력
         */
        Item item = new Item("일반 상품", "일반 카테고리");
        System.out.println("이 상품은 " + item.getName() + " 입니다.\n"
                + "이 상품은 " + item.getCategory() + " 입니다.");

        Product product1 = new Product("전자제품", "가전 제품", 10000, 10);
        product1.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 " + product1.getCategory() + "입니다.");
    }
}
