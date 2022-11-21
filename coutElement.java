package Practices_week1;

import java.util.Scanner;

public class coutElement {
	static Scanner sc = new Scanner(System.in);
	public static void cau5(int[] A,int k){
        int n = A.length;
        int max=A[0],min=A[0];
        for(int i = 0;i< n;i++){
            int temp = A[i];
            int count=0;
            int loopcount=0;
            for(int j = i;j<n;j++){
                if(A[j]==temp)
                    count++;
                
                do{
                    if(A[j]>max)
                        max = A[j];
                    if(A[j]<min)
                        min = A[j];
                    loopcount++;
                }while(loopcount==0);
            }
            if(count==k&&temp!=min&&temp!=max)
                System.out.println(temp);
            
            
        }    
        
      }

	public static void main(String[] args) {
	    System.out.println("Nhap N: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        
        System.out.println("Nhap vao danh sach cac so nguyen");
        for(int i = 0;i < n; i++){
            A[i]= sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Nhap vao so lan xuat hien: ");
        int k = sc.nextInt();
        cau5(A, k);
        sc.close();

	}

}
