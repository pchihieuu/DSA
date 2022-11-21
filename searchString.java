package Practices_week1;

import java.util.Scanner;

public class searchString {
	/// <summary>
    /// Function(method) used to check the string with the contains method, 
	///then use the IndexOf method to find the first value in the found string
    /// </summary>
	public static int configString(String a,String b){
        if(b.length() > a.length())
            return -1;
        else {
            if(a.contains(b)){
                return a.indexOf(b);
            }
        }
        return -1;
    }
    public static int configString2(String a,String b){
        if(b.length() > a.length()){
            return -1;
        }
        int length = b.length();
        int k = 0;
        do{
            String comp = "";
            for(int i = 0;i<length;i++){
                comp +=a.charAt(k+i);			
            } 
            if(comp.compareTo(b)==0){
                return k;
            }
            k++;
        }while(k<=a.length()-length);
        return -1;
    }
    /*
     * Phương thức charAt() trả về giá trị Char của chuỗi tại vị trí có chỉ số index được chỉ định được chỉ định. Index bắt đầu từ 0.
     */
    public static int configString3(String a,String b){
    	 for(int i = 0;i<=(a.length()-b.length());i++){
             int dem=0;
             for(int j =0; j<(b.length());j++){
                 if(b.charAt(j)==a.charAt(i+j)){
                     dem++;
                 }
             }
             if(dem == b.length()){
                 return i;
             }
         }
         return -1;
    }

	public static void main(String[] args) {
		/*Safety code !
		 * Scanner or InputStreamReader/BufferReader...
		 * use Wrapper class to transfer data
		 * Handle exception use Try_catch
		 */
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Mời BẠN NHẬP CHUỐI A: ");
			String a = sc.nextLine();
			System.out.println("MỜI BẠN NHẬP CHUỖI B: ");
			String b = sc.nextLine();
			int chon;
			do {
				System.out.println("**********************MENU*******************");
				System.out.println("*** 1. Kiểm tra sự tồn tại chuỗi cách 1   ***");
				System.out.println("*** 2. Kiểm tra sự tồn tại chuỗi cách 2   ***");
				System.out.println("*** 3. Kiểm tra sự tồn tại chuỗi cách 3   ***");
				System.out.println("*********************************************");
				System.out.println("Mời bạn nhập lựa chọn: ");
				chon = sc.nextInt();
				switch(chon) {
				case 1:
					System.out.println("Kết quả là: "+configString(a, b)); 
					break;
				case 2:
					System.out.println("Kết quả là: "+configString2(a, b)); 
					break;
				case 3:
					System.out.println("Kết quả là: "+configString3(a, b));
					break;
				}
			}while(chon>0);
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}
