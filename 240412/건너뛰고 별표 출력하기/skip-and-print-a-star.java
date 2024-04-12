import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){ // 0,1,2,3
            for(int j=0; j<i+1; j++){ // 1,2,3,4
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }

        for(int i=0; i<n; i++){ // 0,1,2,3
            for(int j=n-i-1; j>=1; j--){ // 4,3,2,1
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}