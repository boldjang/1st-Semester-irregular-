import java.util.*;

class Person{
  private String name;
    private String contactNum;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setContactNum(String cn){
        contactNum = cn;
}
    public String getContactNum(){  
        return contactNum;
    }
    }
class Employee extends Person{
    private double salary;
    private String department;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
     public void setDepartment(String department) {
        this.department = department;
    }
     }
class Student extends Person{
    private String program;
    private int yearLevel;
public String getProgram() {
        return program;
    }
public void setProgram(String program) {
        this.program = program;
    }
public int getYearLevel() {
        return yearLevel;
    }
public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
}
class Faculty extends Employee{
    private boolean status;
     public boolean isRegular() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
public class CollegeList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String root = sc.nextLine();
        
        if (root.equalsIgnoreCase("E")){
            Employee employee = new Employee();
            System.out.println("EMPLOYEE");
            System.out.print("Enter name: ");
            employee.setName(sc.nextLine());
            System.out.print("Enter contact number: ");
            employee.setContactNum(sc.nextLine());
            System.out.print("Enter salary: ");
            employee.setSalary(Double.parseDouble(sc.nextLine()));
            System.out.print("Enter Department: ");
            employee.setDepartment(sc.nextLine());
            
            System.out.println("--------------------------");
            System.out.println("Name: "+ employee.getName());
            System.out.println("Contact: "+ employee.getContactNum());
            System.out.println("Salary: "+ employee.getSalary());
            System.out.println("Department: "+ employee.getDepartment());
        }
        else if (root.equalsIgnoreCase("F")){
            Faculty faculty = new Faculty();
            System.out.println("FACULTY");
            System.out.print("Enter name: ");
            faculty.setName(sc.nextLine());
            System.out.print("Enter contact number: ");
            faculty.setContactNum(sc.nextLine());
            System.out.print("Enter salary: ");
            faculty.setSalary(Double.parseDouble(sc.nextLine()));
            System.out.print("Enter Department: ");
            faculty.setDepartment(sc.nextLine());
            System.out.print("Regular/tenured? Y/N: ");
            if(sc.nextLine().equalsIgnoreCase("Y")){
                faculty.setStatus(true);
            }
            else{
                faculty.setStatus(false);
            }
            System.out.println("--------------------------");
            System.out.println("Name: "+ faculty.getName());
            System.out.println("Contact: "+ faculty.getContactNum());
            System.out.println("Salary: "+ faculty.getSalary());
            System.out.println("Department: "+ faculty.getDepartment());
            if (faculty.isRegular()){
               System.out.println("status: Regular"); 
            }else{
                System.out.println("Status: Irregular");
            }
        }else if (root.equalsIgnoreCase("S")){
            Student student = new Student();
            System.out.println("STUDENT");
            System.out.print("Enter name: ");
            student.setName(sc.nextLine());
            System.out.print("Enter contact number: ");
            student.setContactNum(sc.nextLine());
            System.out.print("Enter program: ");
            student.setProgram(sc.nextLine());
            System.out.print("Enter Year Level: ");
            student.setYearLevel(Integer.parseInt(sc.nextLine()));
            
            System.out.println("--------------------------");
            System.out.println("Name: "+ student.getName());
            System.out.println("Contact: "+ student.getContactNum());
            System.out.println("Program: "+ student.getProgram());
            System.out.println("YearLevel: "+ student.getYearLevel());
        }
    }
}