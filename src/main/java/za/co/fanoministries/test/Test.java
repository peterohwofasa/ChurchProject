package za.co.fanoministries.test;
import za.co.fanoministries.member.Member;
import za.co.fanoministries.registration.Registration;
import java.util.Scanner;


public class Test{
     public static void main(String [] args){

       Registration r1 = new Registration();
        Member m1 = new Member();
          Scanner sc = new Scanner(System.in);

                r1.register();
               
                r1.login();
    


	}
}
