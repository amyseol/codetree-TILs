import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                
        int[] arr = new int[n];
        for(int j = 0; j < n; j++){ // 012
            arr[j] = sc.nextInt();
        }

        for(int i = 1; i <= 9; i++){ // 123456789
            int cnt = 0; 
            for(int j = 0; j < n; j++){
                if(arr[j] == i){
                    cnt++;
                }
            }
            System.out.println(cnt); 
        }
    }
}