import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        int[] arr = new int[100];
        int minValue = INT_MAX;
        int maxValue = INT_MIN;

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                break;
            }
            if(minValue > arr[i]){
                minValue = arr[i];
            }else if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }

        System.out.print(maxValue+" "+minValue);
    }
}