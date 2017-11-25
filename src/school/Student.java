
package school;


public class Student extends Person{
    private static int numStudents = 0;

    Student(String _firstName,String _lastName,String _gender, int _age){
        
      super( _firstName,_lastName,_gender,_age);
     
      numStudents++;  
     
      super.setID(numStudents);
    }
    
 
    /*
    ////////////////////////////////
    /// How to push new Edits///////
    ////////////////////////////////
        1. git add .
        2. git commit -m "Any Message"
        3. git push
    
    ////////////////////////////////
    /// How to pull new Edits///////
    ///////////////////////////////
        1.git pull
    
    ////////////////////////////////
    /// How to Clone Repository/////
    ////////////////////////////////
        1. git clone <Repository URL HERE>
    
    */
    
    
            
}
