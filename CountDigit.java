package ThirtyDaysOfCode;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = 0;

        while(n > 0){

            n = n / 10;
            temp++;
        }
        System.out.println(temp);
    }
}