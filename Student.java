public class Student {
    private String name;
    private int age;
    
   public Student() {
       this.name = "";
       this.age = 0;
   }
   
   public Student(String name, int age){
       this.name = name;
       this.age = age; 
   }
       public Student(String name){
           this.name = name;
           this.age = 18; 
       }
       public static void main (String [] args){
           Student stdnt1 = new Student ("James");
           System.out.println("Student 1 - Name: " + stdnt1.name + ", Age: " + stdnt1.age );
           
           Student stdnt2 = new Student ("John Wilson");
           System.out.println("Student 2 - Name: " + stdnt2.name + ", Age: " + stdnt2.age );
           
           Student stdnt3 = new Student ("Joshua");
           System.out.println("Student 3 - Name: " + stdnt3.name + ", Age: " + stdnt3.age );
       }
}
