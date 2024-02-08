import java.util.Scanner;

class BloodData{
    String bloodType;
    String rhFactor;
    
    BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    
    BloodData(String bt, String rh){
        this.bloodType = bt;
        this.rhFactor = rh;
    }
    
    public void display(){
        System.out.println( bloodType + rhFactor +" is added to the blood bank.");
    }
}

public class RunBLoodData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the blood type of the patient: ");
        String btInput = sc.nextLine();
        System.out.println("Enter Rhesus factor (+ or -): ");
        String rhInput = sc.nextLine();
        
        if (btInput.isEmpty() && rhInput.isEmpty()){
            BloodData bd = new BloodData();
            bd.display();
        }
        else{
            BloodData bd = new BloodData(btInput,rhInput);
            bd.display();
        } 
            
        
       
         
        
    }
    
}