import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        int cntArr[] = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] += a % b; 
            a /= b; 
            if(a <= 1) break;
        }

        int cnt = 0;
        for(int i = 0; i < 10; i++){ 
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    cnt++;
                }else{
                    cnt = 0;
                    continue;
                }
                System.out.print(cnt);
            }
        }
    }
}