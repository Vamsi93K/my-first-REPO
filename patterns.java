// // public class patterns {
// //     public static void main(String[] args){
// //         for(int row = 0; row < 6; row++){
// //             for(int col = 0;col < 6; col++){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // import java.util.Scanner;

// // public class patterns {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter a number: ");
// //         int row = sc.nextInt();

// //         for(int i = 0; i <= row;i++){
// //             for(int j = 0;j <= i; j++){
// //                 System.out.print("*");
// //             }
// //             System.out.println(" ");
// //         }
// //         sc.close();
// //     }
// // }

// import java.util.Scanner;

// public class patterns {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for(int row = 1; row < n ; row++){
//             for(int space = 1; space <= (n-row); space++){
//                 System.out.print(" ");
//             }
//             for(int col=1; col <= row; col++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         sc.close();
//     }
// }
// public class patterns {

//     public static void main(String[] args) {
//         int row = 5;
//         for(int i = 1; i <= row; i++){
//             for(int j = 1;j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = row - 1; i  >=1 ; i--){
//             for(int j = 1;j <= i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

//square and hollow square patterns
// import java.util.Scanner;

// public class patterns {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");

//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if(i == 1 || i == n || j == 1 || j == n){

//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }

//lift aligned rightangled triangle and inverted

// public class patterns {

//     public static void main(String[] args) {
//         int row = 5;
//         for(int i = 1; i <= row; i++){
//             for(int j = 1; j <= i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// public class patterns {

//     public static void main(String[] args) {
//         int row = 5;
//         for(int i = row; i >= 1; i--){
//             for(int j = 1; j <= i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// public class patterns {

//     public static void main(String[] args) {
//         int row = 5;
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         for (int i = row-1; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

public class patterns {

    public static void main(String[] args) {
        int row = 5;
        for(int i = 1; i <= row; i++){
            for(int space = 1; space <= (row-i); space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
