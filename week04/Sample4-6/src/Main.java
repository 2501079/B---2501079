import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int base;
        int height;
        float area;

        System.out.print("삼각형의 밑변 길이 입력 : ");
        base = kb.nextInt();
        System.out.print("삼각형의 높이 입력 : ");
        height = kb.nextInt();

        area = base * height /2.0f;

        System.out.println(">>> 삼각형 면적 <<<");
        System.out.printf("\t밑변 : %,d Cm\n",base);
        System.out.printf("\t높이 : %,d Cm\n",height);
        System.out.printf("\t면적 : %.2f\u33A0\n",area);
    }
}