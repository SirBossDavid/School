
package school;

public class Person {
   
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int id;

    
    Person(String _firstName,String _lastName,String _gender, int _age){
        
      firstName = _firstName;
      lastName = _lastName;
      gender = _gender;
      age = _age;
      
    } 
    
    
       public String getFirstName(){
        return(firstName);
        
    }
    public String getLastName(){
        return(lastName);
    }
    public String getFullName(){
        return(firstName+" "+ lastName);
    }
    public void printFullName(){
        System.out.println(getFullName());
    }
    public int getID(){
        return(id);
    }
  
    
    public void setID(int _id){
        id = _id;
    }
    
}
