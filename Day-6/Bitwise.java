// public class Bitwise {
//     public static void main(String[] args) {
//         String char = "1011";

//     }
// }

// import java.util.Scanner;
// public class Bitwise {

//     public static boolean isPowerTwo(int n){
//         if(n == 0){
//             return false;
//         }
//         while(n % 2 == 0){
//             n = n / 2;
//         }
//         return(n == 1);
//     }
//     public static void main(String[] args) {
//         int n = 16;
//         if(isPowerTwo(n)){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// public class Bitwise {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] array = new int[size];
//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }
//         System.out.println(Arrays.toString(array));
//         int sum = 0;
//         for (int val : array) {
//             if (val % 2 == 0) {
//                 sum += val;
//                 System.out.print(val + " ");
//             }
//         }
//         System.out.println("The sum of Even Numbers: " + sum);
//     }
//}
// import java.util.Arrays;
// import java.util.Scanner;
// public class Bitwise {
//     public static void main(String[] args) {
//         int a[] = {1,2,3};
//         int b[] = {4,5,6};
//         int max = a.length<b.length?a.length:b.length;
//         int c[] = new int[max];
//         int min = a.length < b.length?a.length:b.length;
//         for(int i = 0; i < min; i++){
//             c[i] = a[i]*b[i];
//         }
//         for(int i = min; i < max; i++){
//             if(a.length > b.length){
//                 c[i] = a[i];
//             }
//         }
//         System.out.println(Arrays.toString(c));
//     }
    
// }

//finding second maximum element from given array
// public class Bitwise{
//     public static void main(String[] args){
//         int a[] = {55,20,11,3,90};
//         int first = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;
//         for(int i = 0; i < a.length; i++)
//         {
//             if(a[i]>first){
//                 second = first;
//                 first = a[i];
//             }
//             else if(a[i]>second && a[i] != first){
//                 second = a[i];
//             }
//         }
//         System.out.println(second);
//     }
// }

//printing array by user input
// import java.util.Arrays;
// import java.util.Scanner;
// public class Bitwise {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int N = sc.nextInt();
//         System.out.println("Enter Array: ");
//         int[] arr = new int[N];
//         for(int i = 0; i < N; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print(Arrays.toString(arr));
//     }
// }

//find max num in given array
// import java.util.Arrays;
// import java.util.Scanner;
// public class Bitwise {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int N = sc.nextInt();
//         int[] arr = new int[N];
//         int max = arr[0];
//         int second_max = arr[0];
//         for(int i = 0; i < N; i++){
//             arr[i] = sc.nextInt();
//             if(max <= arr[i]){
//                 second_max = max;
//                 max = arr[i];
//             }
//             else if(second_max < arr[i]){
//                 second_max = arr[i];
//             }
//         }
//         System.out.println("second maximum value is: "+ second_max);
//         System.out.println("maximum Value is: "+ max);
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;
// public class Bitwise {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of the array: ");
//         int N = sc.nextInt();
//         int[] arr = new int[N];
//         arr[0] = sc.nextInt();
//         int min = arr[0];
//         for(int i = 1; i < N; i++){
//             arr[i] = sc.nextInt();
//             if(min > arr[i]){
//                 min = arr[i];
//             }
//         }
//         System.out.print("The minimum value of the array: "+ min);
//     }
// }
import java.util.Arrays;
import java.util.Scanner;
public class Bitwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0, right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: "+ Arrays.toString(arr));
    }
}




