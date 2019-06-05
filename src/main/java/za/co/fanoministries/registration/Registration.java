package za.co.fanoministries.registration;
import za.co.fanoministries.people.member.Member;
import java.util.Scanner;

        public class Registration{

            Scanner scanner = new Scanner(System.in);
             public  Member members[];
                     int number;
                        int num = 20191;
                    
    public void register(){
 System.out.println();
System.out.println(" \t \t \t >>>>>>>  Welcome to Freedom For All Nations Outreach   <<<<<<<<<");
   System.out.println(" \t \t \t \t \t >>>>>>> Arena Of Power <<<<<<< ");
    System.out.println("\t \t 2601 Van Der Hoff Road, Kirkney, Pretoria west. Pretoria South Africa ");
        System.out.println();
    System.out.println("Press enter to register membership");
      scanner.nextLine();
       System.out.println("How many people do you want to register");
           number = scanner.nextInt();

               members = new Member[number];
         for(int a = 0; a < number; a++){ 
          Member  member = new Member();                   

            scanner.nextLine(); 
            System.out.print("Enter First name : ");        
             String firstName = scanner.nextLine();
                member.setFirstName(firstName);

        System.out.print("Enter Surname : ");
          String surname =  scanner.nextLine();
                member.setSurname(surname);

            System.out.print("Enter Date of birth : ");
               String date = scanner.nextLine();
               member.setDateOfBirth(date); 

                System.out.print("Enter Gender : ");
                    String gender = scanner.nextLine();
                    member.setGender(gender);

                        System.out.print("Enter Nationality : ");
                            String nationality = scanner.nextLine();
                            member.setNationality(nationality);

                        System.out.print("Enter Residential address : ");
                            String residence = scanner.nextLine();
                            member.setAddress(residence);

                       System.out.print("Enter Phone number : ");
                                long phone = scanner.nextLong();
                                    member.setPhoneNumber(phone);

                        scanner.nextLine();
                        System.out.print("User Name : ");
                         String userName = scanner.nextLine();
                          member.setUserName(userName);

                        System.out.print("Password : ");
                        String password = scanner.nextLine();
                            member.setPassword(password);

     	              System.out.println("Membership No: Fano" + num++);
                        member.setMemberShipNumber(num++);

                        members[a] = member;
    
System.out.println(".................................................................");
System.out.println("THANK YOU FOR REGISTERING WITH FANO MINISTRY GOD BLESS YOU!!!!");
System.out.println(".................................................................");                                                       
System.out.println();
System.out.println("========= Membership information display below ===========");
System.out.println("First name : " + member.getFirstName());
System.out.println("Surname : " + member.getSurname());  
System.out.println("Username : " + member.getUserName());     
System.out.println("Password : " + member.getPassword()); 
System.out.println("Membership No : " + member.getMemberShipNumber());
System.out.println("Keep it safe ");


         }// end of loop

} // end of register method.






}
