package db;

import java.util.Scanner;

public class course {
    public long id;
    public String name;
    public void  course_Info() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id :) ");
		 id=sc.nextLong();
		System.out.println("Enter Name :) ");
		sc.nextLine();
		name=sc.nextLine();
		}
}
