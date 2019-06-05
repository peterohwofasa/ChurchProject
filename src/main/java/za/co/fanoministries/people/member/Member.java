package za.co.fanoministries.people.member;
import  za.co.fanoministries.people.person.Person;
import java.util.Scanner;

public class Member extends Person{

    private String userName;
    private String password;
    private long memberShipNumber;
    private String reason;
    private String appointment;

public void setAppointment(String appointment){
this.appointment = appointment;
}

public String setAppointment(){
return this.appointment;
}

public void setReason(String reason){
this.reason = reason;
}
public String getReason(){
return this.reason;
}
 
public void setMemberShipNumber(long memberShipNumber){
this.memberShipNumber = memberShipNumber;
}

public long getMemberShipNumber(){
return this.memberShipNumber;
}

public void setUserName(String userName){
this.userName = userName;
}

public String getUserName(){
return this.userName;
}

public void setPassword(String password){
this.password = password;
}

public String getPassword(){
return this.password;
}

public String toString(){
return "UserName :" + getUserName() + "Password :" + getPassword();
}

public void Appointment(){
Scanner scanner = new Scanner(System.in);
System.out.println();
System.out.println("Welcome " + this.userName);
System.out.println("enter the date and day you want to book you appointment below");
String appiontment = scanner.nextLine();
setAppointment(appointment);
System.out.println("enter Reason for Appointment");
String reason = scanner.nextLine();
setReason(reason);
System.out.println();
System.out.println("Thanks for your submit we will reply you shortly");
System.out.println();

} // method to book appointment





}
