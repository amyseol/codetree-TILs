import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char text = sc.next().charAt(0);
        char[] arr = new char[]{'L','E','B','R','O','S'};

        int idx = -1;
        for(int i = 0; i < 6; i++){
            if(arr[i] == text){
                idx = i;
                System.out.print(idx);
            }
        }

        if(idx == -1){
            System.out.print("None");
        }
    }
}