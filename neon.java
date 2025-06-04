import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = 0, sum = 0, product = 1;

        while (n != 0) {
            temp = n % 10;
            sum += temp;
            product *= temp;
            n = n / 10;
        }
        if(sum == product){
            System.out.println("It is a Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
}
