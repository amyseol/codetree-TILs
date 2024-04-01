import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split(":");
        int a = Integer.parseInt(strArr[0])+1;
        System.out.print(a+":"+strArr[1]);
    }
}