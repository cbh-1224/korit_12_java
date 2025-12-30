package ch09_getter_setter.univ_student;

public class UniveStudent2 {
    String name;
    int grade;
    double score;

    public UniveStudent2() {
    }

    public UniveStudent2(String name) {
        this.name = name;
    }

    public UniveStudent2(int grade) {
        this.grade = grade;
    }

    public UniveStudent2(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UniveStudent2(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        if(score < 0 || score > 4.5) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if(grade < 0 || grade > 4) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.grade = grade;
    }

    public void setScore(double score) {
        if(score < 0 || score > 4.5) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }
    public void showInfo() {
        System.out.println("\n이름: " + name + "\n학년: " + grade + "\n점수: " + score);
    }
}
