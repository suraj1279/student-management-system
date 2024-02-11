package db;
import java.sql.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		 boolean exit = false;
		 Scanner sc=new Scanner(System.in);
	        while (!exit) {
	            System.out.println("1. Add Student");
	            System.out.println("2. Add Faculty");
	            System.out.println("3. Add Department");
	            System.out.println("4. Add Course");
	            System.out.println("5. Display Student Info");
	            System.out.println("6. Display Faculty Info");
	            System.out.println("7. Display Course Info");
	            System.out.println("8. Display Faculty");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();  

	            switch (choice) {
	            case 1:
	            	Student obj=new Student();
	            	obj.student_Info();
	            	long ids=obj.id;
	            	String nam=obj.name;
	            	String addr=obj.Address;
	            	long mobileno=obj.Mobile;
	            	try {
	        			Class.forName("com.mysql.jdbc.Driver");
	        			String sql = "INSERT INTO totalInfo VALUES (?,?,?,?)";
	        			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","suraj@1279");
	        			PreparedStatement st=con.prepareStatement(sql);
	        			st.setLong(1, ids);
	        			st.setString(2, nam);
	        			st.setString(3,addr);
	        			st.setLong(4, mobileno);
	        			System.out.println("inserting records");
	        		
	        			st.executeUpdate();
	        			
	        		}
	        		catch(Exception e) {
	        			 System.out.println(e);
	        		}
	            	break;
	            case 2:
	            	Teacher obj2=new Teacher();
	            	obj2.teacher_Info();
	            	long ids2=obj2.id;
	            	String nam2=obj2.Name;
	            	
	            	String addr2=obj2.address;
	            	long mobileno2=obj2.mobileno;
	            	try {
	        			Class.forName("com.mysql.jdbc.Driver");
	        			String sql = "INSERT INTO teacherInfo VALUES (?,?,?,?)";	        			
	        			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","suraj@1279");
	        			PreparedStatement st=con.prepareStatement(sql);
	        			st.setLong(1,ids2);
	        			st.setString(2, nam2);
	        			st.setString(3, addr2);
	        			st.setLong(4, mobileno2);
	        			System.out.println("inserting records");
	        			
	        			st.executeUpdate();
	        			
	        		}
	        		catch(Exception e) {
	        			 System.out.println(e);
	        		}
	            	break;
	            case 3:
	            	department obj3=new department();
	            	obj3.depertment_Info();
	            	long ids3=obj3.id;
	            	String nam3=obj3.name;

	            	try {
	        			Class.forName("com.mysql.jdbc.Driver");
	        			String sql = "INSERT INTO departmentInfo VALUES (?,?)";
	        			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","suraj@1279");
	        			PreparedStatement st=con.prepareStatement(sql);
	        			st.setFloat(1, ids3);
	        			st.setString(2, nam3);
	        			System.out.println("inserting records");
	        			
	        			st.executeUpdate();
	        			
	        		}
	        		catch(Exception e) {
	        			 System.out.println(e);
	        		}
	            	break;
	            case 4:
	            	course obj4=new course();
	            	obj4.course_Info();
	            	long ids4=obj4.id;
	            	String nam4=obj4.name;
	            	
	            	try {
	        			Class.forName("com.mysql.jdbc.Driver");
	        			String sql = "INSERT INTO courseInfo VALUES (?,?)";  
	        			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/course","root","suraj@1279");
	        			PreparedStatement st=con.prepareStatement(sql);
	        			st.setLong(1, ids4);
	        			st.setString(2, nam4);
	        			System.out.println("inserting records");
	        			
	        			st.executeUpdate();
	        			
	        		}
	        		catch(Exception e) {
	        			 System.out.println(e);
	        		}
	            	break;
	            case 5:
//	            	Student obj5=new Student();
//	            	obj5.student_Info();
	            	 Connection con = null;
	                 PreparedStatement st = null;
	                 ResultSet ans = null;
	            	try {
	            		Class.forName("com.mysql.jdbc.Driver");
	            		
	            		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","suraj@1279");
	            		String query="select * from totalInfo where id = ?";
	            		st=con.prepareStatement(query);
	                    System.out.print("Enter student ID :) ");
	                    Long studentId = sc.nextLong();
	                    st.setLong(1, studentId);
	                    ans = st.executeQuery();
	                    if(ans.next()) {
	                    	Long ID=ans.getLong("Id");
	                    	String Name = ans.getString("name");
	                        String Address = ans.getString("Address");
	                        Long Mobile_number=ans.getLong("mobileno");
	                        System.out.println("Student ID :) " + ID);
	                        System.out.println("First Name :) " + Name);
	                        System.out.println("Address Name :) " + Address);
	                        System.out.println("Mobile_no :) " + Mobile_number);
	                        System.out.println();
	                        System.out.println();
	                    }
	                    else {
	                    	System.out.println("Student with Id "+studentId+" not found");
	                    }
	            	}
	            	catch(Exception e){
	            		System.out.println(e);
	            	}
	            	break;
	            case 6:
	            	 Connection con1 = null;
	                 PreparedStatement st1 = null;
	                 ResultSet ans1 = null;
	            	try {
	            		Class.forName("com.mysql.jdbc.Driver");
	            		
	            		con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","suraj@1279");
	            		String query="select * from teacherInfo where id = ?";
	            		st1=con1.prepareStatement(query);
	                    System.out.print("Enter teacher ID :) ");
	                    Long teacherId = sc.nextLong();
	                    st1.setLong(1, teacherId);
	                    ans1 = st1.executeQuery();
	                    if(ans1.next()) {
	                    	Long ID=ans1.getLong("Id");
	                    	String Name = ans1.getString("name");
	                        String Address = ans1.getString("Address");
	                        Long Mobile_number=ans1.getLong("mobileno");
	                        System.out.println("Teacher ID :) " + ID);
	                        System.out.println("Name :) " + Name);
	                        System.out.println("Address :) " + Address);
	                        System.out.println("Mobile_no :) " + Mobile_number);
	                        System.out.println();
	                        System.out.println();
	                    }
	                    else {
	                    	System.out.println("Teacher with Id "+teacherId+" not found");
	                    }
	            	}
	            	catch(Exception e){
	            		System.out.println(e);
	            	}
	            	break;
	            case 7:
	            	Connection con2 = null;
	                 PreparedStatement st2 = null;
	                 ResultSet ans2 = null;
	            	try {
	            		Class.forName("com.mysql.jdbc.Driver");
	            		
	            		con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","suraj@1279");
	            		String query="select * from departmentInfo where id = ?";
	            		st2=con2.prepareStatement(query);
	                    System.out.print("Enter Department ID :) ");
	                    Long departmentId = sc.nextLong();
	                    st2.setLong(1, departmentId);
	                    ans2 = st2.executeQuery();
	                    if(ans2.next()) {
	                    	Long ID=ans2.getLong("Id");
	                    	String Name = ans2.getString("name");
	                        System.out.println("Department ID :) " + ID);
	                        System.out.println("Department Name :) " + Name);
	                        System.out.println();
	                        System.out.println();
	                    }
	                    else {
	                    	System.out.println("Department with Id "+departmentId+" not found");
	                    }
	            	}
	            	catch(Exception e){
	            		System.out.println(e);
	            	}
	            	break;
	            case 8:
	            	Connection con3 = null;
	                 PreparedStatement st3 = null;
	                 ResultSet ans3 = null;
	            	try {
	            		Class.forName("com.mysql.jdbc.Driver");
	            		
	            		con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/course","root","suraj@1279");
	            		String query="select * from courseInfo where id = ?";
	            		st3=con3.prepareStatement(query);
	                    System.out.print("Enter Course ID :) ");
	                    Long departmentId = sc.nextLong();
	                    st3.setLong(1, departmentId);
	                    ans3 = st3.executeQuery();
	                    if(ans3.next()) {
	                    	Long ID=ans3.getLong("Id");
	                    	String Name = ans3.getString("name");
	                        System.out.println("Course ID :) " + ID);
	                        System.out.println("Course Name :) " + Name);
	                        System.out.println();
	                        System.out.println();
	                    }
	                    else {
	                    	System.out.println("Course with Id "+departmentId+" not found");
	                    }
	            	}
	            	catch(Exception e){
	            		System.out.println(e);
	            	}
	            	break;
	            default:
	            	exit=true;
	            	System.out.println("Thanku :) ");
	            }
	        }
	}

}
