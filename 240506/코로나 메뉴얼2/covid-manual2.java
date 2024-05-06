import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[5];
        int num = 0;
        int celcius;
        char symptom;

        for(int i = 0; i < 3; i++){ 
            symptom = sc.next().charAt(0);
            celcius = sc.nextInt();

            if(celcius >= 37 && symptom == 'Y')
                num = 1;
            else if(celcius >= 37)
                num = 2;
            else if(symptom == 'Y')
                num = 3;
            else   
                num = 4;
            count[num]++;
        }

        for(int i = 1; i <= 4; i++){
            System.out.print(count[i]+" ");
        }
        if(count[1] >= 2){
            System.out.print("E");
        }

    }
}