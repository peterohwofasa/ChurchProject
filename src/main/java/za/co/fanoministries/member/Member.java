package za.co.fanoministries.member;
import  za.co.fanoministries.people.Person;

public class Member extends Person{

    private String userName;
    private String password;

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






}
