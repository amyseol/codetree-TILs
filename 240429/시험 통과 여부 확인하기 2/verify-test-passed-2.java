import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++){ // 3 번 돌기
            int[] arr = new int[4];
            int avg = 0;
            int sum = 0;
            for(int j = 0; j < 4; j++){ // 4 번 돌기 
                arr[j] = sc.nextInt();
                sum += arr[j];
                avg = sum/4;
            }
            if(avg >= 60) {
                System.out.println("pass"); 
                cnt++;
            }else{
                System.out.println("fail");
            }
        } 
        System.out.println(cnt);
    }
}