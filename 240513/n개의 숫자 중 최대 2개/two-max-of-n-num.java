import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int value = Integer.MIN_VALUE; 
        for(int i = 0; i < N; i++){ 
            for(int j = i+1; j < N; j++){ 
                if(arr[i] <= arr[j]){
                    value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                }
            }
        }

        System.out.println(arr[0] +" "+ arr[1]);
    }
}