import java.util.Scanner;
class Quadrilateral {
    public void showDescription (){
        System.out.println("-is quaderatiral");
    }
}

class Rectangle extends Quadrilateral  {
    public void showDescription (){
        System.out.println("-has 4 right angles");
        super.showDescription();
    }   
}
class Square extends Rectangle   {
    public void showDescription (){
        System.out.println("-has 4 equal angels");
        super.showDescription();
    }
}
class Parallelogram extends Quadrilateral {
    public void showDescription (){
        System.out.println("-has 2 pair of parellel side");
        super.showDescription();
    }
}
class Rhombus extends Parallelogram {
    public void showDescription (){
        System.out.println("-has 4 congruent sides");
        super.showDescription();
    }
}
class Trapezoid extends Rhombus {
    public void showDescription (){
        System.out.println("-has 4 congruent sides");
        super.showDescription();
    }
}
      
public class RunQuad {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Select from the following: ");
        System.out.println("R - Reactangle ");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        String ans = scan.nextLine();
        
        switch (ans){
            case "R", "r" -> {
                System.out.println("A rectangle:");
                Rectangle rec = new Rectangle();
                rec.showDescription();
            }
                
                case "S", "s" -> {
                    System.out.println("A Square:");
                    Square sqr = new Square();
                    sqr.showDescription();
            }
                
                case "P", "p" -> {
                    System.out.println("A Parallelogram:");
                    Parallelogram par = new Parallelogram();
                    par.showDescription();
            }
                
                case "H", "h" -> {
                    System.out.println("A Rhombus:");
                    Rhombus rho = new Rhombus();
                    rho.showDescription();
            }
                
                case "T", "t" -> {
                    System.out.println("A Trapezoid:");
                    Trapezoid trap = new Trapezoid();
                    trap.showDescription();
            }
                
        }  
    }  
}
