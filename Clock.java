package Practites;

import java.io.*;

public class Clock {
	static int check() throws NumberFormatException, IOException {
		BufferedReader speed = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhập giá trị  n:  ");
		int n=Integer.parseInt(speed.readLine());
		// random array
	    int a[] = {6, 2, 5, 5, 4, 4, 6, 3, 2, 8};
	    int h = 0, m = 0;
	    while(h < 24){
	        if(a[h / 10] + a[h % 10] + a[m / 10] + a[m % 10] == n){
	            System.out.printf("%02d:%2d", h, m);
	            return 0;
	        }
	        m++;
	        if(m == 60){
	            m = 0;
	            h++;
	        }
	    }
	   System.out.println("Impossible");
	    return 0;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(check());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
