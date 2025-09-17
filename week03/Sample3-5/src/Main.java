import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float litter = 0.0f;
        float km = 0.0f;
        float result = 0.0f;

        System.out.print("소비된 연료량 입력 : ");
        litter = sc.nextFloat();
        System.out.print("운행한 거리 입력 : ");
        km = sc.nextFloat();

        result = km / litter;

        System.out.printf("자동자 소비된 연료 : %.1f Litter\n",litter);
        System.out.printf("자동자 운행 거리 : %.1f %c\n",km,'\u339e');
        System.out.printf("연비 : %.2f",result );

    }
}