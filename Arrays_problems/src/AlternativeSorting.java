//Q.Alternative Sorting //
//Input[ ]={1,2,3,4,5,6,7,8,9,0}
//output[ ]={ 9,0,8,1,7,2,6,3,5,4}

import java.util.Arrays;
import java.util.Scanner;

public class AlternativeSorting {

    static void alternativeSorting(int[] arr, int n) {

        Arrays.sort(arr);

        int i = 0, j = n - 1;

        System.out.print("Alternative Sorted Array: ");
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }

        if (n % 2 != 0) {
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        alternativeSorting(arr, n);

        scanner.close();
    }
}