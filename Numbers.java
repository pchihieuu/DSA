package Practices_week1;

import java.util.Scanner;

public class Numbers {
//1.Write a program that inputs the positive integer n and outputs the sum of all positive odd numbers less than n.//
	static int rankNumbers(int n) {
		int sum =0;
		for(int i=1;i < n;i+=2) {
			sum +=i;
		}
		return sum;
	}
//2.Write a program to input the positive integer n and output to the screen the sum of all positive event numbers or equal to n.//
	static int rankNumbers2(int n) {
		int sum2 =0;
		for(int i=2;i<=n;i+=2) {
			sum2 +=i;
		}
		return sum2;
	}
	static long factorial(int n) {
		//delete-recursion//
		long fact =1;
		for(int i=2; i<=n;i++) {
			fact = fact * i; 
		}
		return (n==0||n==1? 1: fact);
	}
	//there is a way to use recursion but not optimal//
	/*
	 * using divide whole (n/4)
	 */
	static boolean isEven1(int n) {
		float temp = (float)n/2 - n/2;
		return(temp >0?false:true);
	}
	/*
	 * divide whole
	 */
	static boolean isEven2(int n) {
		float temp =(float) n/2;
		return(temp==n/2?true:false);
	}
	static boolean isEven3(int n) {
		float temp = n/2;
		return(temp*2!=n?false:true);
	}
	/*
	 * using for loop
	 */
	static boolean isEven4(int n) {
		int temp=0;
		for(int i=1;i<=n; i+=2) 
			temp=i;
		
		return(temp!=n?true:false);// false odd, true even//
	}
	/*
	 * using the algorithm Bitwise (AND)
	 */
	static boolean isEven5(int n) {
		boolean flag = true;
		if((n & 1) == 1) {
			flag = false;
		} 
		return flag;
				
	}
	/// <summary>
    /// using unit numbers
    /// </summary (0,2,4,6,8...2n=> true),(1,3,5,7,9...2n+1 =>false)>
	static boolean isEven6(int n) {
		int unit = n-((n/10)*10);
		switch(unit) {
			case 0: return true;
			case 2: return true;
			case 4: return true;
			case 6: return true;
			case 8: return true;
		}
		return false;
		
	}
	/// <summary>
    /// using library Math.pow(x,n) => x^n
    /// </summary (-1)^n when parameter ==-1 <=> false:true>
	static boolean isEven7(int n) {
		double parameter = Math.pow(-1, n);
		return(parameter!=-1?true:false);
	}
	public static void Examp(int n) throws InterruptedException {
		//Multiple Time equal StartTime and EndTime//
		long startTime = System.currentTimeMillis();
		Thread.sleep(10);
		
		long endTime = System.currentTimeMillis();
		/*System.out.println("CASE 1:"+ rankNumbers(n));*/
		long OfTime = endTime - startTime;
		System.out.println("Thời gian thực hiện chương trình: "+OfTime + "Millis");
	}
	

	public static void main(String[] args) {
		/*Safety code !
		 * Scanner or InputStreamReader/BufferReader...
		 * use Wrapper class to transfer data
		 * Handle exception use Try_catch
		 */
		try {
			Scanner sc = new Scanner(System.in);
			int n;
			int choose;
			do {
				System.out.println("*********************MENU**********************");
				System.out.println("***  1.Tổng các số lẻ nhỏ hơn n             ***");
				System.out.println("***  2.Tổng các số chẵn nhỏ hơn hoặc bằng n ***");
				System.out.println("***  3.Giai thừa của một số                 ***");
				System.out.println("***  4.Kiểm tra tính chẵn lẻ số nguyên      ***");
				System.out.println("***  5.Exit program                         ***");
				System.out.println("***********************************************");
				System.out.println("Nhập lựa chọn: ");
				choose =sc.nextInt();
				switch(choose) {
					case 1:
						System.out.println("Mời bạn nhập n: ");
						n= sc.nextInt();
						System.out.println("Tổng các số lẻ là: "+rankNumbers(n));
						Examp(n);
						break;
					case 2:
						System.out.println("Mời bạn nhập n: ");
						n= sc.nextInt();
						System.out.println("Tổng các số lẻ đến n: "+ rankNumbers2(n));
						Examp(n);
						break;
					case 3:
						System.out.println("Mời bạn nhập n: ");
						n= sc.nextInt();
						System.out.println("Giai thừa của một số: "+factorial(n));
						Examp(n);
						break;
					case 4:
						System.out.println("Mời bạn nhập n: ");
						n= sc.nextInt();
						if(isEven5(n))
							System.out.println("Số " +n+ "là số chẵn");
						else
							System.out.println("Số " +n+ "là số lẻ");
						Examp(n);
						break;
						
					case 5:
						System.exit(0);
					
				}
			}while(choose>0);
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		

	}

}
