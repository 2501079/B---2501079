import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;

        System.out.print("당신의 이름은 ? ");
        name = keyboard.nextLine();

        System.out.printf("%s님의 나이는 ? ",name);
        age = keyboard.nextInt();

        System.out.printf("%s님의 나이는 %d살 입니다", name, age);
    }
}
