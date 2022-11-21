package Practices_week1;

import java.util.Scanner;

public class countBinarySearch {

	public static void main(String[] args) {
		 try {
			 Scanner sc = new Scanner(System.in);
		        System.out.println("Nhập kích thước của dãy số: ");
		        int n = sc.nextInt();
		        int[] a = new int[n];
		        for (int i =0;i<n;i++) {
		            a[i] = sc.nextInt();
		        }
		        System.out.println("Vị trí K cần tìm: "+indexBinarySearch(a));
		        sc.close();

		} catch (Exception e) {
			// handle exception//
			e.printStackTrace();
		}

	        

	}
    public static int indexBinarySearch(int[] a){
        
    	int n = a.length; 
        int left,right;
        int midpoint = 1;
        if(n<2)
            return -1;
        do{
            left=0;right=0;
            for(int i=0;i<midpoint;i++){
                left+=a[i];
            }
            for(int j=n-1;j>=midpoint;j--)
            {
                right+=a[j];
            }
            if(left==right)
            {
                return midpoint-1;
            }
            midpoint++;
        }while(midpoint<n);
        return -1;
        

    }

}
