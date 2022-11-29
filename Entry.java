package Practices_week1;

import java.util.*;

public class Entry {

	public static void main(String[] args) {
		/*Nhập và một số nguyên dương n, tiếp theo là n số nguyên của dãy số a.
		Hãy in ra các số chính phương*  có trong dãy theo thứ tự tăng dần (phía sau mỗi phần tử có đúng một khoảng trắng),
		nếu không tồn tại số chính phương nào trong dãy a thì in ra "NULL".*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("Nhập n số nguyen của A: ");
        Set<Integer> listNumber = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            listNumber.add((int)sc.nextInt()) ;
        }

        // Solve
        int max = (int)Math.sqrt(Collections.max(listNumber));
        int[] b = new int[max + 1];
        for (int i = 0; i <=max; i ++) {
            b[i] = i*i;
        }

        // Output
        boolean flag = false;
        for (int i: b) {
            for (int j : listNumber) {
                if (j == i) {
                    flag = true;
                    System.out.print(j + " ");
                    break;
                }
            }
        }
        if (flag == false) System.out.print("NULL");
    }

	

}
