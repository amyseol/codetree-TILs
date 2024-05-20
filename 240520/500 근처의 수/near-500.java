import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int maxNum = arr[0];
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            if(arr[i] < 500 && arr[i] > maxNum){
                maxNum = arr[i];
            }else if(arr[i] > 500 && arr[i] < minNum){
                minNum = arr[i];
            }
        }

        System.out.print(maxNum+" "+minNum);
    }
}