import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
        }

        for(int i = 1; i <= 9; i++){
            int cnt = 0;
            for(int j = 0; j < 100; j++){
                if((arr[j]/10) == i){
                    cnt++;
                }
            }
            System.out.println(i+" - "+cnt);
        }
    }
}