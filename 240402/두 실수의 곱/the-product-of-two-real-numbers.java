public class Main {
    public static void main(String[] args) {
        double a = 5.26;
        double b = 8.27;

        double result = Math.round((a*b) * 1000)/1000.0;

        System.out.print(String.format("%.3f", result));
    }
}