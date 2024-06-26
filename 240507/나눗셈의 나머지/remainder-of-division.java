import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cntArr[] = new int[b];

        while(a > 1){
            int cnt = a % b; 
            a /= b; 
            cntArr[cnt]++;
        }

        int sum = 0;
        for (int count : cntArr) {
            sum += count * count; 
        }

        System.out.print(sum);
    }
}