package Practices_week1;

import java.util.Scanner;

public class addMin {
	///Sắp xếp tăng dần bằng InsertionSort///
	public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int index = i;
            while (index > 0 && a[index - 1] > value) {
                a[index] = a[index - 1];
                index--;
            }
            a[index] = value;
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử n:");
        int n = sc.nextInt();
        System.out.println("Nhập phần tử A: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertionSort(a);
        
        // Solve
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] - a[i - 1] > 1) {
                result = a[i - 1] + 1;
                break;
            }

        }
        if (result == 0) {
            result = a[n - 1] + 1;
        }
        System.out.println(result);
    }
	

}
