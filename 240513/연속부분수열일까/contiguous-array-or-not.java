import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(); // 4
        int n2 = sc.nextInt(); // 2
        int[] A = new int[n1];
        int[] B = new int[n2];

        for(int i = 0; i < n1; i++){ 
            A[i] = sc.nextInt(); // 1 5 2 6 
        } 

        for(int i = 0; i < n2; i++){
            B[i] = sc.nextInt(); // 5 6
        }

        int i = 0;
        int j = 0;
        for(i = 0; i < n1 && j < n2; i++){
            if(A[i] == B[j]){ 
                j++;
                break;
            }
        }

        for(j = j; j < n2; j++){
            if(A[i+j] == B[j]){
                i++;
            }else{
                break;
            }
        }
        
        if(j == n2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    } 
}