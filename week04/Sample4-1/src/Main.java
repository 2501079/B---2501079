public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int c = (((a++) + 2) - --b);
        int d = (((a--) + (++b)) + 2);
        float e = (float)(5.0/4.0);

        a += 4;

        System.out.printf("a = %d, b = %d, c = %d, d = %d e = %.2f\n", a, b, c, d,e);

    }
}