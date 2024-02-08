class Exam{
String message;
private double price;
private boolean status = true;

public Exam(){
message = "Good luck";
    System.out.println("Good Luck !!");
}
double getPrice(){
    return price;
}
boolean isFinished(){
    return status;
}
}
class Midterm extends Exam{
public Midterm(){
    System.out.println("Exam has started !!");
}
}
class Quiz extends Midterm{
public Quiz(){
    System.out.println("Quiz has started !!");
}
}
class Essay extends Quiz{
public Essay(){
    System.out.println("Essay has started !!");
}
}
public class NewClass {

    public static void main(String[] args) {
        Essay e = new Essay();    
    }
    
}