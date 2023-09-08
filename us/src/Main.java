import java.util.Scanner;

public class Main {

    /* This function takes the power of the numbers up to the number specified by the user, again by the number specified by the user. */
    public static void main(String[] args) {

        int n,a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of limits you want to set : ");
        n = input.nextInt();
        System.out.print("enter exponent value : ");
        a = input.nextInt();

        for (int i = 1; i <= n; i *= a) {
            System.out.println(i);
        }
    }
}