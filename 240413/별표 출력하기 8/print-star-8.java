import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n= 4

        for(int i=1; i<n+1; i++){ // i= 1,2,3,4
            if(i%2!=0){
                System.out.print("*");
            }else{
                for(int j=0; j<i; j++){ // 1,2,3,4
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}