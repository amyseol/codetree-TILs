import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n = 3

        for(int i=0; i<n; i++){ // 0,1,2 
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<(2*n)-(2*i)-1; j++){ // * 5,3,1 
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}