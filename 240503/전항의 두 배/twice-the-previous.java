import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int newArr[] = new int[10];
        newArr[0] = n1;
        newArr[1] = n2;
        
        for(int i = 2; i < 10; i++){
            newArr[i] = newArr[i-1] + newArr[i-2] * 2;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}