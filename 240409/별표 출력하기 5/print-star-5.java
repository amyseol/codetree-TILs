import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4

        for(int i=n; i>=1; i--){ // i는 4, 3, 2, 1 번 돈다
            for(int j=1; j<=i; j++){ // j는 1,2,3,4 / 1,2,3 / 1,2 / 1 
                for(int k=1; k<=i; k++){ // k는 1,2,3,4 / 1,2,3 / 1,2 / 1 
                    System.out.print("*"); // i가 4일 땐 4개씩 * 출력 
                }
                System.out.print(" "); // i가 4일 땐 4번 마다 공백 출력
            }
            System.out.println();
        }
    }
}