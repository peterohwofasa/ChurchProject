package za.co.fanoministries.test;
import za.co.fanoministries.people.member.Member;
import za.co.fanoministries.registration.Registration;
import java.util.Scanner;


public class Test{
     public static void main(String [] args){

       Registration register = new Registration();
        Member member = new Member();
          Scanner scanner = new Scanner(System.in);
                register.register();
               
System.out.println();
System.out.println("<<<<<<<<<<<<<< Login Here >>>>>>>>>>");
System.out.println();
System.out.print("Username : ");
String user = scanner.nextLine();
System.out.print("Password : ");
String pass = scanner.nextLine();
int book ;

for(int b =0; b < register.members.length; b++){
if(user.equals(register.members[b].getUserName()) && pass.equals(register.members[b].getPassword())){

System.out.println("Welcome " + user);
System.out.println("enter 1. to book appointment. to logout 2.");
book = scanner.nextInt();

if(book ==1 ){
member.Appointment(); ///// apppointment method
System.out.println();
} else if(book == 2){
        ///////// still checking for logout
        }
    
    } //end of loop
    else if(!user.equalsIgnoreCase(register.members[b].getUserName()) || !pass.equalsIgnoreCase(register.members[b].getPassword())){
        System.out.println("User Name or Password is incorrect you have 3 trial.");
            for(int c=0; c<3; c++){
               System.out.println();
            scanner.nextLine();
            System.out.print("Username : ");
             user = scanner.nextLine();
            System.out.print("Password : ");
            pass = scanner.nextLine();
                            
                if(user.equalsIgnoreCase(register.members[b].getUserName()) && pass.equalsIgnoreCase(register.members[b].getPassword())){
                System.out.println("Welcome to Fano " + user);
                System.out.println("enter 1. to book appointment or 2. to logout");
                    book = scanner.nextInt();                  
                    if(book ==1 ){
                    member.Appointment(); ///// apppointment method
                    System.out.println();
                    } else if(book == 2){
                           ///////// still checking for logout  
                            }
                
                       c=5; // to stop the trial if login is correct.
                    }   
                else if(c == 2){
            System.out.println("Sorry you can't login now");
                     }  
                } // loop for trial
                     

        } // end of failed login 
        
    } // end of loop

    


	}
}
