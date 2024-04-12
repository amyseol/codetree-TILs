import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n = 3

        for(int i=0; i<n; i++){ // i= 0,1,2
            for(int j=0; j<i; j++){ // 공백 0,1,2
                System.out.print("  ");
            }
            for(int j=0; j<(n*2)-(i*2)-1; j++){ // * 5,3,1
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n-2; i>=0; i--){ // i= 0,1
            for(int j=0; j<i; j++){ // 공백 1,0
                System.out.print("  ");
            }
            for(int j=0; j<(n*2)-(i*2)-1; j++){ // * 3,5
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}