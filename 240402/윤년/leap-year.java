import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if(year%4==0){
            if(year%400==0){
                System.out.println(1);
            }else if(year%100==0){
                System.out.println(0);
            }else{System.out.println(1);}
        }else{System.out.println(0);}
    }
}