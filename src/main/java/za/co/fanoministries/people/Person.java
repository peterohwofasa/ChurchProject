package za.co.fanoministries.people;

    public abstract  class Person{

	private String firstName;
	private  String surname;
	private  String dateOfBirth;
	private String gender;
	private  String nationality;
	private  String address;
	private  long phoneNumber;
        

public void setFirstName(String firstName){
this.firstName = firstName;
}

public String getFirstName(){
return this.firstName;
}

public void setSurname(String surname){
this.surname = surname;
}

public String getSurname(){
return this.surname;
}

public void setDateOfBirth(String dateOfBirth){
this.dateOfBirth = dateOfBirth;
}
public String getDateOfBirth(){
return this.dateOfBirth;
}
public void setGender(String gender){
this.gender = gender;
}
public String getGender(){
return this.gender;
}

public void setNationality(String nationality){
this.nationality = nationality;
}
public String getNationality(){
return this.nationality;
}

public void setAddress(String address){
this.address = address;
}

public String getAddress(){
return this.address;
}

public void setPhoneNumber(long phoneNumber){
this.phoneNumber = phoneNumber;
}

public long getPhoneNumber(){
return this.phoneNumber;
}

public String toString(){
return "First Name: " + getFirstName() + "Surname:" + getSurname() + "nationality : " + getNationality();
}


}
