package ch11_arrays;
/*
    int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    총합과 평균을 계산해서 다음과 같이 출력하시오
    총점 :
    평균 :

    // 총합을 내는 메서드 - calcSum()
    // 평균을 내는 메서드 - calcAvg()
    // 호출 - printSumAndAvg()
    // 총합과 평균을 출력하는 곳에서 두개의 메서드를 호출하는 방식

 */
public class Array06  {

    private int[] inputScores() {
        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        return scores;
    }

    private int calcSum() {
        int[] scores = inputScores();
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    private double calcAvg() {
        int[] scores = inputScores();
        int sum = calcSum();
        double avg = 0;
        avg = (double)sum / scores.length;

        return avg;
    }

    public void printSumAndAvg() {
        int sum = calcSum();
        double avg = calcAvg();
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균: " + avg + "점");
    }

    public static void main(String[] args) {
        Array06 array06 = new Array06();
        array06.printSumAndAvg();
    }
}
