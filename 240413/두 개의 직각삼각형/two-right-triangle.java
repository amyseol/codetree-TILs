import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n = 3

        for(int i=0; i<n; i++){ // i= 0,1,2
            for(int j=0; j<n-i; j++){ // * 3,2,1
                System.out.print("*");
            }
            for(int j=0; j<i*2; j++){ // 공백 0,2,4
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){ // * 3,2,1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}