import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int INT_MAX = Integer.MAX_VALUE;
        
        int N = sc.nextInt();
        int[] arr = new int[100];
        int minValue = INT_MAX;
        int cnt = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < minValue){
                minValue = arr[i];
                cnt++;
            }
        }      

        System.out.print(minValue + " " + cnt);
        
    }
}