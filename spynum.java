// public class Day4 {
//     public static void main(String[] args) {
//         int row = 5;
//         for(int i = 1; i <= row; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(i+ " ");
//             }
//             System.out.println("");
//         }
//     }
// }

// public class Day4 {
//     public static void main(String[] args) {
//         int row = 5;
//         for(int i = 1; i <= row; i++){
//             for(int space = (row-i); space >= 1; space--){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(i);
//             }
//             System.out.println("");
//         }
//     }
// }

// public class Day4 {

//     public static void main(String[] args) {
//         int n = 5;
//         int k = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(k+ " ");
//                 k++;
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.util.Scanner;

// public class Day4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a numbre: ");

//         int n = sc.nextInt();

        // for(int i = 1; i <= n; i++){
        // for(int j = 1; j <= i; j++){
        // System.out.print(i+j-1 +" ");
        // }
        // System.out.println(" ");
        // }
        // for(int i = 1; i <= n; i++){
        // for(int j = 1; j <= i; j++){
        // System.out.print(j+" ");
        // }
        // System.out.println("");

//         for(int i = 1; i <= n; i++){
//             for(int space = 1; space <= (n-i); space++){
//                 System.out.print("-");
//             }
//             for(int j = i; j <= i; j++){
//                 System.out.print(i);
//             }
//             System.out.println(" ");
//         }
//     }
// }

//counting numbers form given array

// import java.util.Scanner;

// public class Day4 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         long n = sc.nextLong();
//         int count = 0;

//         while(n > 0){
//             n = n/ 10;
//             count++;
//         }
//         System.out.println("Number of Digits: " + count);
//     }
// }

// 
// import java.util.Scanner;

// public class Day4 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         long n = sc.nextLong();
//         int count = 0;

//         for(int i = 2; i <= (n/2); i++){
//             if(n%i == 0){
//                 System.out.println("Divisors: "+ i);
//                 count++;
//             }
//         }
//         System.out.println("Number of Divisors: "+ count);
//     }
// }

// public class Day4 {

//     public static void main(String[] args) {
//         int n = 100;

//         for(int i = 1; i <= n; i++){
//             if(i % 3 == 0 && i % 5 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// public class Day4 {
//     public static void main(String[] args){
//         int a = 12;
//         int b = 18;
//         int max = (a>b)?a:b;
//         while(true){
//             if(max%a == 0 && max%b == 0){
//                 System.out.println(max);
//                 break;
//             }
//             max++;
//         }
//     }
// }

// public class Day4 {
//     public static void main(String[] args){
//         int n = 8764;
//         int sum = 0;

//         while(n != 0){
//             sum += n % 10;
//             n = n / 10;
//         }
//         System.out.println(sum);
//     }
// }

// public class Day4 {

//     public static void main(String[] args) {
//         int n = 12345;
//         int rev = 0;
//         while (n != 0) {
//             rev = n % 10;
//             System.out.print(rev);
//             n = n / 10;
//         }
//     }
// }

import java.util.Scanner;
public class spynum {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        int copy = n, temp = 0, result = 0;
        
        n = n * n;
        while(n != 0){
            temp = n % 10;
            result += temp;
            n = n / 10;
        }
        if(copy == result){
            System.out.println("The given number is a spynumber");
        }
        else{
            System.out.println("Not a spyNumber");
        }
    }
}