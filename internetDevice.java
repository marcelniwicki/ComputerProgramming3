

public class internetDevice
{
    String name;
    boolean connected;
    static int connectedDevices = 0;
    
    internetDevice(String name){
        this.name = name;
        connected = true;
        connectedDevices += 1;
    }
    
    void connect(){
        if(connected == false){
            connectedDevices += 1;
        }
        connected = true;
    }
    
    void disconnect(){
        if(connected == true){
            connectedDevices -= 1;
        }
        connected = false;
    }
    boolean isConnected(){
        return connected;
    }
    void displayStatus(){     
        if(connected == true){
            System.out.println("Device (" + name + ") is connected.");
        }
        else{
            System.out.println("Device (" + name + ") is disconnected.");
        }
    }
    static void displayConnections(){
        System.out.println("Number of connected devices: " + connectedDevices);
    }
    
    public static void main(String[] args){
    internetDevice laptop1 = new internetDevice("laptop");
    internetDevice tv = new internetDevice("TV");
    internetDevice phone = new internetDevice("phone");
    internetDevice radio = new internetDevice("radio");
    internetDevice tablet = new internetDevice("tablet");
    laptop1.connect();
    laptop1.displayStatus();
    tv.disconnect();
    tv.displayStatus();
    phone.connect();
    phone.displayStatus();
    radio.disconnect();
    radio.displayStatus();
    tablet.connect();
    tablet.displayStatus();
    displayConnections();
    
    }
    
}
