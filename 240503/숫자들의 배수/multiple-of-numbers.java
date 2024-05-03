import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < 10; i++){ 
            int[] arr = new int[10];
            arr[i] = (i+1) * n;
            
            if(arr[i] % 5 == 0){
                cnt++;
                if(cnt == 3){
                    break;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}