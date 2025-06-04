// public class Arrays {
//     public static void main(String[] args) {
//         int arr[] = {1,3,4,2,3,2,2,4,4};
//         int n = arr.length;
//         for(int i = 0; i < n;i++){

//         }
//     }
// }

// import java.util.Scanner;

// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int c[][] = new int[3][];
//         c[0] = new int[3];
//         c[1] = new int[2];
//         c[2] = new int[1];
//         for (int i = 0; i < c.length; i++) {
//             for (int j = 0; j < c[i].length; j++) {
//                 c[i][j] = sc.nextInt();
//             }
//         }
//         printArray(c);
//     }

//     public static void printArray(int a[][]) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Arrays;
// import java.util.Scanner;
// public class Bitwise {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int N = sc.nextInt();
//         int[] arr = new int[N];
//         for(int i = 0; i < N; i++){
//             arr[i] = sc.nextInt();
//         }
//         int left = 0, right = arr.length-1;
//         while(left < right){
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//         System.out.println("Reversed Array: "+ Arrays.toString(arr));
//     }
// }

// package Array;
//frequency of the digit from thhe given array
// public class Arrays {

//     public static void main(String[] args) {
//         int[] arr = { 1, 3, 2, 4, 3, 3, 2, 4, 4 };
//         int length = arr.length;
//         boolean[] bool = new boolean[length];
//         int temp = 0;
//         int ind = arr[0];
//         for (int i = 0; i < length; i++) {
//             int count = 0;
//             if (!bool[i]) {
//                 for (int j = 0; j < length; j++) {
//                     if (arr[i] == arr[j]) {
//                         count++;
//                         bool[j] = true;
//                     }
//                 }
                
//                 System.out.println(arr[i] + " comes " + count + " times");
//                 if (count > temp || (count == temp && arr[i] > ind)) {
//                     temp = count;
//                     ind = arr[i];
//                 }
//             }

//         }
//         System.out.println("---------------------------------");
//         System.out.println(ind + " is Bigger and repeted " + temp + " times");
//     }
// }