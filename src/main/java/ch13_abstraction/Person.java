package ch13_abstraction;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void introduce();
}
