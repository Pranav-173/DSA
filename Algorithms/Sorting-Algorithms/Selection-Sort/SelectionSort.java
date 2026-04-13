import java.util.Scanner;
import java.util.Arrays;

public class Selectionsort {
/*
* Edge-case behavior:
* - Negative size is rejected.
* - Size 0 exits early with "Nothing to Sort.".
* - Null/empty arrays are ignored by the algorithm.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input: size cannot be negative.");
            sc.close();
            return;
        }
        if (n == 0) {
            System.out.println("Nothing to Sort.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array: " + Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        sc.close();
    }
    public static void selectionsort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n-1;i++) {
            int min_index = i;
            for (int j = i + 1;j < n;j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}