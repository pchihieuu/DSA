package LyThuyet;

import java.util.Scanner;
//Khởi tạo lớp sinh viên chứa các thông tin mang tính che đậy dữ liệu//
class SV
{
	private String MSSV, Ho, Ten;
	private float diem;
	public SV(String ms, String ho, String ten, float diemtb) 
	{
		this.MSSV = ms;
		this.Ho = ho;
		this.Ten = ten;
		this.diem = diemtb;
	}
	public String getMSSV() 
	{
		return MSSV;
	}
	public String getHo() 
	{
		return Ho;
	}
	public String getTen() 
	{
		return Ten;
	}
	public float getDiem() 
	{
		return diem;
	}
}
//Khởi tạo dữ liệu dùng chung//
class Link
{
	public SV dData;
	public Link next;
	public Link(SV d) 
	{
		dData = d;
	}
}
//Xây dựng lớp cho LinkedList để giải quyết một số yêu cầu của bài toán//
class LinkedList
{
	private Link first, last, pos;
	private int count;
	public LinkedList() 
	{
		first = last = pos =  null;
		count = 0;
	}
	public boolean isEmpty() 
	{
		return first == null;
	}
	public void insert(SV dd, Link p) 
	{
		Link newLink = new Link(dd);
		if(p == null) 
		{
			newLink.next = first;
			first = newLink;
		}
		else 
		{
			newLink.next = p.next;
			p.next = newLink;
		}
		if(newLink.next == null)
			last = newLink;
		count ++;
	}
	public void insertFirst(SV dd) 
	{
		insert(dd, null);
	}
	public void insertPos(SV dd) 
	{
		insert(dd, pos);
	}
	public void insertLast(SV dd) 
	{
		insert(dd, last);
	}
	private void delete(Link p)
	{
		Link t;
		if(p == null) 
		{
			t = first;
			first = t.next;
		}
		else
		{
			t = p.next;
			p.next = t.next;
		}
		if(t.next == null)
			last = p;
		count--;
		
	}
	public void deleteFirst()
	{
		delete(null);
	}
	public void deletePos()
	{
		delete(pos);
	}
	public boolean searchList(SV dd) 
	{
		Link c;
		c = first;
		pos = null;
		while(c!=null && c.dData.getMSSV().compareTo(dd.getMSSV())!=0) 
		{
			pos = c;
			c = c.next;
		}
		return c!=null;
		
	}
	public boolean searchOrderList(SV dd) 
	{
		Link c;
		c = first;
		pos = null;
		while(c!=null && c.dData.getMSSV().compareTo(dd.getMSSV())<0)
		{
			pos = c;
			c = c.next;
		}
		if(c!=null && c.dData.getMSSV().compareTo(dd.getMSSV())>0)
			return false;
		return c!=null;
	}
	public void startList() 
	{
		pos = first;
	}
	public void nextLink()
	{
		if(pos == null)
		   pos = first;
		pos = pos.next;
	}
	public boolean endList()
	{
		return pos == null;
	}
	public SV getData()
	{
		return pos.dData;
	}
	public int nItem() 
	{
		return count;
	}
}
//Hàm runtime chương trình//
public class SinhVien {
	static Scanner sc = new Scanner(System.in);
	static void nhap(LinkedList l) {
		SV x;
		String ms, ho, ten;
		float diemtb;
		do {
			sc.nextLine();
			System.out.println("Nhập MSSV : ");
			ms = sc.nextLine();
			if(ms.length()>0) {
				System.out.println("Nhập họ : ");
				ho = sc.nextLine();
				System.out.println("Nhập tên : ");
				ten = sc.nextLine();
				System.out.println("Nhập điểm : ");
				diemtb = sc.nextFloat();
				x = new SV(ms, ho, ten, diemtb);
				l.insertLast(x);
			}
		}while(ms.length()>0);
	}
	static LinkedList saptt(LinkedList l)
	{
		LinkedList l1 = new LinkedList();
		SV x;
		while(!l.isEmpty())
		{
			l.startList();
			x = l.getData();
			l1.searchOrderList(x);
			l1.insertPos(x);
			l.deleteFirst();
		}
		return l1;
	}
	static void xuat(LinkedList l) 
	{
		l.startList();
		while(!l.endList())
		{
			SV x = l.getData();
			System.out.printf("\n%-8s %-20s %-8s %4d", x.getMSSV(), x.getHo(), x.getTen(), x.getDiem());
			l.nextLink();
		}
	}
	static SV tim(LinkedList l, String ms) 
	{
		l.startList();
		while(!l.endList() && l.getData().getMSSV().compareTo(ms)!=0)
			l.nextLink();
		if(l.endList())
			return null;
		return l.getData();
	}

	public static void main(String[] args) {
		int chon;
		String ms;
		SV x;
		LinkedList l = new LinkedList();
		do {
			System.out.println("\n1. Nhập");
			System.out.println("\n2. Xuất");
			System.out.println("\n3. Sắp thứ tự");
			System.out.println("\n4. Tìm");
			System.out.println("\nChọn :");
			chon = sc.nextInt();
			switch(chon) 
			{
				case 1: 
					nhap(l);
					break;
				case 2:
					xuat(l);
					break;
				case 3:
					l = saptt(l);
					break;
				case 4:
					sc.nextLine();
					System.out.println("Nhập mã sinh viên cần tìm: ");
					ms = sc.nextLine();
					x = tim(l, ms);
					if(x == null) 
					
						System.out.println("Không tìm thấy sinh viên trùng khớp!");
					else
						System.out.printf("\n%-8s %-20s %-8s %4d", x.getMSSV(), x.getHo(), x.getTen(), x.getDiem());
					break;
			
			}
		}while(chon > 0);

	}

}
