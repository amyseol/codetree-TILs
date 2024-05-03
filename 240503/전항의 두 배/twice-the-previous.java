import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[2];
        for(int i = 0; i < 2; i++){
            arr[i] = sc.nextInt();
        }

        int newArr[] = new int[10];
        newArr[0] = arr[0];
        newArr[1] = arr[1];
        
        for(int i = 2; i < 10; i++){
            newArr[i] = newArr[i-1] + newArr[i-2] * 2;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}