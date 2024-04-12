import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        for(int i=0; i<n; i++){ 
            for(int j=n-i; j>=1; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        // n = 5
        for(int i=1; i<n; i++){ // 1,2,3,4
            for(int j=n-i; j<=n; j++){ // 2,3,4,5
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}