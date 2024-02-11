package db;
import java.util.*;
public class Teacher {
	public long id;
	public String Name;
	public String address;
	public long mobileno;
	public void  teacher_Info() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id :) ");
		 id=sc.nextLong();
		System.out.println("Enter Name :) ");
		sc.nextLine();
		Name=sc.nextLine();
		//System.out.println(Name);
		
		System.out.println("Enter Address :) ");
	
		address=sc.nextLine();
		System.out.println("Enter mobile_no :) ");
		mobileno=sc.nextLong();
		}
	
}
