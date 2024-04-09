import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n 이 5 일 때 
        
        for(int i=0; i<n; i++){ // i 는 5 번 돈다 
            for(int j=0; j<n-i; j++){ // j 는 5-0, 5-1, 5-3,... 번 돈다 
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}