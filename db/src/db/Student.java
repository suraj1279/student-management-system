package db;
import java.util.*;
import java.sql.*;
public class Student {
	public long id;
	public String name;
	public String Address;
	public long Mobile;
	public void  student_Info() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id :) ");
		 id=sc.nextLong();
		System.out.println("Enter Name :) ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Address :) ");
		
		 Address=sc.nextLine();
		 System.out.println("Enter Mobile_No :) ");
		Mobile=sc.nextLong();
		
		
		}
	
		
		
	}

