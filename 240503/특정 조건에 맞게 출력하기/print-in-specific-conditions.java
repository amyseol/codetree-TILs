import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            int[] newArr = new int[100];
            if(arr[i] == 0){
                break;
            }else if (arr[i] % 2 == 0){
                newArr[i] = arr[i] / 2;
            }else if(arr[i] % 2 == 1){
                newArr[i] = arr[i] + 3;
            }
            System.out.print(newArr[i] + " ");
        }
    }
}