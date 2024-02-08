import java.time.LocalTime;
import java.util.Scanner;

interface Alarm{
    void setAlarm (String time);
    String showAlarm();
}

abstract class Weekday implements Alarm{
    
}

public class JWS_Monday extends Weekday{

private String time;
public static void main(String[] args) {
    
    Scanner jws = new Scanner(System.in);
    JWS_Monday mon = new JWS_Monday();

    System.out.print ("Enter time for alarm in this format " 
        + " (HH:MM) : ");
    String alarm = jws.nextLine ();
    mon.setAlarm (alarm);
}
public void setAlarm(String time) {
    this.time = time;
    LocalTime alarm = LocalTime.parse(time);
    LocalTime now = LocalTime.now();
    if (alarm.isAfter(now)){
        System. out. println ("Alarm set for tomorrow!");
    }
    else {
        System.out.println("I'll wake you up later!");
    }
}
    public String showAlarm() {
        return time;
    }
}

