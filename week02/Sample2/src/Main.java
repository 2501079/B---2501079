import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name = "name"; // 선언문 (준비)

        name = keyboard.nextLine(); //Data입력


        //처리

        System.out.println("입력 받은 이름 :"+name);
    }
}