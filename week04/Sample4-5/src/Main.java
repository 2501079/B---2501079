import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int salary,save,expensee,remain,money;
        float saveRate;

        System.out.print("당신의 급여액 입력 : ");
        salary = kb.nextInt();
        System.out.print("월 저축 비율 (예 20% -> 0.2) : ");
        saveRate = kb.nextFloat();
        System.out.print("월 기본 지출 비용 입력 : ");
        expensee = kb.nextInt();

        save = (int)(salary*saveRate);
        remain = salary-(save+expensee);
        money = remain/30;

        System.out.println("[예산 계산 결과]");
        System.out.printf("월급 : %,d원\n",salary);
        System.out.printf("저축액 : %,d원\n",save);
        System.out.printf("저출액 : %,d원\n",expensee);
        System.out.printf("남은 금액 : %,d원\n",remain);
        System.out.printf("일일 사용 가능 예산 : %,d원\n",money);
    }
}