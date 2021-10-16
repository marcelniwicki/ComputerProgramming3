

public class lamp
{
    boolean isLampOn;
    
    void switchOnTheLamp(){
        isLampOn = true;
    }
    
    void switchOffTheLamp(){
        isLampOn = false;
    }
    
    void displayInfo(){
    if (isLampOn) {
        System.out.println("Lamp is on");
    }   else {
        System.out.println("Lamp is off");
    }
    }
}
    
    

