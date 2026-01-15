package ch22_lambda;

@FunctionalInterface // 함수형 인터페이스형인 것을 명시
public interface Calculator {
    int compute(int a, int b);
}
