import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n= 3

        for(int i=0; i<n; i++){ // i= 0,1,2
            for(int j=n-i; j>1; j--){ // 2,1,0
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){ // *= 1,2,3
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){ // i= 0,1
            for(int j=0; j<i+1; j++){ // 1,2
                System.out.print(" ");
            }
            for(int j=0; j<n-i-1; j++){ // *= 2,1
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}