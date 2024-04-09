import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){ // j는 0,1,2,3 번 돈다. 
            for(int j=0; j<i+1; j++){ // j는 i+1 번 돈다. 
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}