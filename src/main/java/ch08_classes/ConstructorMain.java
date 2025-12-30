package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        System.out.println(constructor2.num);

        Constructor constructor3 = new Constructor(3);
        System.out.println(constructor3.num);

        Constructor constructor4 = new Constructor("김사");
        System.out.println(constructor4.name);

        Constructor constructor5 = new Constructor(5, "김오");
        System.out.println(constructor5.num);
        System.out.println(constructor5.name);

        constructor5.displayInfo();

    }
}
