package javacity;
import java.util.*;

public class Citizen {
	private String name;
	private int age;
	private int voterID;
	private String password;
	
	private static int citizencount=0;
	
	public Citizen(String name, int age,String password) {
		this.name = name;
		setAge(age);
		this.password = password;
		citizencount++;
		this.voterID=citizencount;
	}
	
	public void setAge(int newAge) {
		if(age<0) {
			System.out.println("Invalid request");
			
		}else {
			age=newAge;
		}
	}
	public void changePassword(String oldPass, String newPass) {
		if(password.equals(oldPass)) {
			password=newPass;
			System.out.println("Password Change");
			
		}else {
			System.out.println("Invalid Password not changed");
		}
		
	}
	public void display() {
		System.out.println(name + "ID: "+ voterID);
	}
}
