import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int won = 0;
        float convert;
        float dollar = 0.0f;

        System.out.print("오늘의 dollar 환율은 ? ");
        convert = kb.nextFloat();
        System.out.print("원화 얼마를 dollar로 환전할까 ? ");
        won = kb.nextInt();

        dollar = won / convert;

        System.out.printf("원화 %,d원은 %,f 달러($) 입니다.\n",won,dollar);
    }
}