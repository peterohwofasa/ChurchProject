package za.co.fanoministries.registration;
import za.co.fanoministries.member.Member;
import java.util.Scanner;

        public class Registration{

            Scanner sc = new Scanner(System.in);
              Member members[];
                     int number;
                        int num = 20191;
                    
    public void register(){
 
System.out.println(" \t \t \t >>>>>>>  Welcome to Freedom For All Nations Outreach   <<<<<<<<<");
   System.out.println(" \t \t \t \t \t >>>>>>> Arena Of Power <<<<<<< ");
    System.out.println("\t \t 2601 Van Der Hoff Road, Kirkney, Pretoria west. Pretoria South Africa ");
        System.out.println();
    System.out.println("Press enter to register membership");
      System.out.println();
       System.out.println("How many people do you want to register");
           number = sc.nextInt();

               members = new Member[number];
         for(int a = 0; a < number; a++){ 
          Member  m1 = new Member();                   

            sc.nextLine(); 
            System.out.print("Enter First name : ");
            
             String firstName = sc.nextLine();
                m1.setFirstName(firstName);
               System.out.println();

        System.out.print("Enter Surname : ");
          String surname =  sc.nextLine();
                m1.setSurname(surname);
              System.out.println();

            System.out.print("Enter Date of birth : ");
               String date = sc.nextLine();
               m1.setDateOfBirth(date); 
                 System.out.println();

                System.out.print("Enter Gender : ");
                    String gender = sc.nextLine();
                    m1.setGender(gender);
                       System.out.println();

                        System.out.print("Enter Nationality : ");
                            String nationality = sc.nextLine();
                            m1.setNationality(nationality);
                               System.out.println();

                        System.out.print("Enter Residential address : ");
                            String residence = sc.nextLine();
                            m1.setAddress(residence);
                              System.out.println();

                       System.out.print("Enter Phone number : ");
                                long phone = sc.nextLong();
                                    m1.setPhoneNumber(phone);
                                     System.out.println();

                        sc.nextLine();
                        System.out.print("User Name : ");
                         String userName = sc.nextLine();
                          m1.setUserName(userName);
                           System.out.println();

                        System.out.print("Password : ");
                        String password = sc.nextLine();
                            m1.setPassword(password);

                         //int num = 20191;
     	              System.out.println("Membership No: Fano" + num++);
                                 System.out.println();
                        members[a] = m1;
    
System.out.println(".................................................................");
System.out.println("THANK YOU FOR REGISTERING WITH FANO MINISTRY GOD BLESS YOU!!!!");
System.out.println(".................................................................");                                                       
System.out.println();
System.out.println("========= Membership information display below ===========");
System.out.println("First name : " + m1.getFirstName());
System.out.println("Surname : " + m1.getSurname());  
System.out.println("Username : " + m1.getUserName());     
System.out.println("Password : " + m1.getPassword()); 
//System.out.println("Membership No : " );
 System.out.println("Keep it safe ");
    }// end of loop

} // end of register method.

public void login(){

System.out.println();
System.out.println("<<<<<<<<<<<<<< Login Here >>>>>>>>>>");
System.out.println();
System.out.print("Username : ");
String user = sc.nextLine();
System.out.print("Password : ");
String pass = sc.nextLine();

for(int b =0; b < number; b++){
if(user.equals(members[b].getUserName()) && pass.equals(members[b].getPassword())){
System.out.println("Welcome " + user);

System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");


    } //end of loop
    else if(!user.equals(members[b].getUserName()) || !pass.equals(members[b].getPassword())){
        System.out.println("User Name or Password is incorrect you have 3 trial.");
            for(int c=0; c<3; c++){
               System.out.println();
            System.out.print("Username : ");
             user = sc.nextLine();
            System.out.print("Password : ");
            pass = sc.nextLine();
                            
                if(user.equals(members[b].getUserName()) && pass.equals(members[b].getPassword())){
                System.out.println("Welcome to Fano " + user);
                
                System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");


                       c=5; // to stop the trial if login is correct.
                    }   
                else if(c == 2){
            System.out.println("Sorry you can't login now");
                     }  
                } // loop for trial
                     

        } // end of failed login 
        
    } // end of loop
} // end of login Method




}
