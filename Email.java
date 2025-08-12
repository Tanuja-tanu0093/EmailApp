package emailApp;

import java.util.Scanner;

public class Email {
  private  String firstName;
  private  String lastName;
  private   String password;
  private  String department;
  private String email;
  private  int mailBoxCapacity=500;
  private  int defaultPasswordLength=10;
  private  String alternateEmail;
  private String companySuffix="aeycompany.com";
  
  //Constructor to receive the first name and last name
  public Email(String firstName,String lastName)
  {
	  this.firstName=firstName;
	  this.lastName=lastName;
	  System.out.println("EMAIL CREATED:"+this.firstName+" "+this.lastName);
  
  
  //Call a method asking for  the department -return the department
    this.department=setDepartment();
    System.out.println("Department Name:"+department);
    //	Call a method that returns a random password
    this.password=randomPassword(defaultPasswordLength);
    System.out.println("Your Password is :"+this.password);
         
  
  
  //combine the elements to generate an email
  
  email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
  System.out.println("Your Email Address:"+email);
  }
  
  //Ask for the department
  private String setDepartment()
  {
	  System.out.println("New Worker:"+firstName+".Department Codes \n Enter the department\n1 for sales \n 2 development  \n 3 for accounting  \n 0 for none \n Enter the Department Code:");
	  Scanner scanner=new Scanner(System.in);
	  int deptChoice=scanner.nextInt();
	  if(deptChoice==1)
	  {
		  return "Sales";
	  }
	  else if(deptChoice==2) {
		 return "Development";
	}
	  else if(deptChoice==3)
	  {
		  return "Accounting";
	  }
	  else {
		return "";
	}
	  
	  
  }
  //Generate a random Password
  
  
  private String randomPassword(int length)
  {
	  String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
	  char[] password=new char[length];
	  for( int i=0;i<length;i++)
	  {  
		 int rand=(int)( Math.random()* passwordSet.length()); 
		 password[i]=passwordSet.charAt(rand);
	  }
	  return new String(password);
  }
  //Set the mailbox Capacity
  public void setMailBoxCapacity(int capacity)
  {
	  this.mailBoxCapacity=capacity;
  }
  
  
  //Set the alternate email
  
  public void setAlternateEmail(String altEmail)
  {
	  this.alternateEmail=altEmail;
  }
  //Change the password
  
  public void changePassword(String password)
  {
	  this.password=password;
  }
    public int getMailBoxCapacity()
    {
    	return mailBoxCapacity;
    }
    public String getAlternateEmail()
    {
    	return alternateEmail;
    }
    
    public String getPassword()
    {
    	return password;
    }
    public String showInfo()
    {
    	return "DISPLAY NAME: "+firstName+" "+lastName+
    			"\nCOMPANY EMAIL:"+email+
    			"\nMAILBOX CAPACITY:"+mailBoxCapacity+"mb";
    }
}
