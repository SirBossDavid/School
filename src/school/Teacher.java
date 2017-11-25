
package school;


public class Teacher extends Person{
    
    private String subject;
   
    
      Teacher(String _firstName,String _lastName,String _subject,String _gender, int _age){
      
          super( _firstName,_lastName,_gender,_age);
          subject = _subject;
      }
      
     
    
}
