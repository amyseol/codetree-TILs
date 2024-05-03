import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int []arr  = new int[100];
        int cnt = 0;

        for(int i = 0; i < 100; i++){
            if(i == 0){
                arr[i] = 1;
            }else if(i == 1){
                arr[i] = n;
            }else{
                arr[i] = arr[i-1] + arr[i-2];
                if(arr[i] > 100){
                    cnt++;
                }   
            }

            if(cnt == 2){
                break;
            }
                     
            System.out.print(arr[i] + " ");        
        }
    }
}