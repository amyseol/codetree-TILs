import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        for(int i=0; i<n; i++){ 
            if(i==0||i%2==0){
                for(int j=0; j<(i/2)+1; j++){ 
                    System.out.print("*"+" ");
                }
            }else{
                for(int j=0; j<n-(i/2); j++){ 
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }

        for(int i=n-1; i>=0; i--){ 
            if(i==0||i%2==0){ 
                for(int j=0; j<(i/2)+1; j++){ 
                    System.out.print("*"+" ");
                }
            }else{ // 
                for(int j=0; j<n-(i/2); j++){ 
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }           
    }
}