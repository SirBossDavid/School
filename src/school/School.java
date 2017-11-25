//did it work
//hello
package school;

public class School {

   
    public static void main(String[] args) {
     
        Student alex = new Student("Alex","Sanchez","male",11);
        
        Student cristal= new Student("Cristal","Oriheula","female",9);
        
        cristal.printFullName();
        
        Teacher kania = new Teacher("Kania","unknown","history","female",52);
        
        kania.printFullName();
    }
    
    
}
