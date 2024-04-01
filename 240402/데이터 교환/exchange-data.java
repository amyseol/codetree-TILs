public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp = b;
        int bbs = c;

        b = a;
        c = temp;
        a = bbs;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}