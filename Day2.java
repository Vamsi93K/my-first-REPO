// //control statements//
// public class Day2 {
//     public static void main(String[] args){
//         int a = 3;
//         if (a%2 == 0){
//             System.out.println("Even number");
//         }
//         else{
//             System.out.println("Odd number");
//         }
//     }
// }

//user input
// import java.util.Scanner;
// public class Day2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");

//         int a = sc.nextInt();

//         if (a%2 == 0){
//             System.out.println("Even number");
//         }
//         else{
//             System.out.println("Odd number");
//         }
//         sc.close();
//     }
// }

//without using modulus

// import java.util.Scanner;
// public class Day2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");

//         int x = sc.nextInt();

//         int result = (x / 2) * 2;

//         if (result == x){
//             System.out.println("Even number");
//         }
//         else{
//             System.out.println("Odd number");
//         }
//         sc.close();
//     }
// }

//maximum of two numbers
// import java.util.Scanner;

// public class Day2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a value for a: ");

//         int a = sc.nextInt();

//         System.out.print("Enter a value for b: ");

//         int b = sc.nextInt();

//         System.out.print("Enter a value for c: ");

//         int c = sc.nextInt();

//         if (a>b && a>c){
//             System.out.println("a is greater number");
//         }
//         else if(b>a && b>c){
//             System.out.println("b is greater number");
//         }
//         else{
//             System.out.println("c is greater number");
//         }
//         sc.close();

//     }
// }

// import java.util.Scanner;
// public class Day2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a value for i :");
//         int i = sc.nextInt();

//         while(i< 10){
//             System.out.println(i);
//             i++;
//         }
//         sc.close();


//     }
// }
public class Day2 {

    public static void main(String[] args){
        for(int row = 0 ; row < 7; row++){
            for(int col = 0;col <5; col++){
                if (row == 0 || col == 2){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            System.out.println();
            }
        }
    }
}