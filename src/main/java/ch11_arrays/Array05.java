package ch11_arrays;
/*
   String[] scores 배열에
   A / B / C / D / F element로 초기화
   실행 예
   A+ / B+ / C+ / D+ / F
   가 되도록 정의하시오.
 */
public class Array05 {

    private String[] inputSocres() {
        String[] scores = {"A", "B", "C", "D", "F"};

        return scores;
    }
    public void printElement() {
        String[] scores = inputSocres();

        for (int i = 0; i < scores.length - 1; i++) {
            System.out.print(scores[i] + "+ / " );
        }
        System.out.print(scores[4]);
    }

    public static void main(String[] args) {
        Array05 array05 = new Array05();
        array05.printElement();
    }
}
