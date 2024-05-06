import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        int[] secAcc = new int[3];
        int a,b,c,d;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        for(int i = 0; i < 3; i++){ // 012
            arr[i] = sc.next();
            for(int j = i; j < i+1; j++){ // 012
                secAcc[j] = sc.nextInt();
                if(arr[i].equals("Y") && secAcc[j] >= 37){
                    a++;
                }else if(arr[i].equals("N") && secAcc[j] >= 37){
                    b++;
                }else if(arr[i].equals("Y") && secAcc[j] < 37){
                    c++;
                }else if(arr[i].equals("N") && secAcc[j] < 37){
                    d++;
                }
            }
        }
        System.out.print(a+" "+b+" "+c+" "+d);
        if(a >= 2){
            System.out.print(" E");
        }
    }
}