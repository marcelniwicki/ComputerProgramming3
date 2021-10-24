

public class Clock
{   int hour = 0;
    int minute = 0;
    boolean alarmOn;
    int alarmHour = 0;
    int alarmMinute = 0;
    
    
    Clock(int hour, int minute){
        alarmOn = false;
        setClock(hour, minute);
    }
    
    void setClock(int hour, int minute){
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
    }
    
    void displayTime(){
        System.out.println(hour + ":" + minute);
    }
    
    void setAlarm(int hour, int minute){
        alarmOn = true;
        if (hour >= 0 && hour <= 23){
            this.alarmHour = hour;
        }
        if (minute >= 0 && minute <= 59){
            this.alarmMinute = minute;
        }
    }
    
    void addMinute(){
        minute++;
        if (minute > 59){
            minute = 0;
            hour += 1;
        }
        if (alarmOn && hour == alarmHour && minute == alarmMinute){
            runAlarm();
        }
    }
    
    void runAlarm(){
        System.out.println("beep-beep-beep-beep!!");
        
    }
    
    public static void main(String[] args){
        Clock clock = new Clock(12, 47);
        clock.displayTime();
        clock.setClock(18, 14);
        clock.displayTime();
        clock.setClock(9, 03);
        clock.displayTime();
        clock.setClock(23, 58);
        clock.displayTime();
        clock.setAlarm(23, 59);
        clock.addMinute();
        clock.displayTime();
        clock.addMinute();
        clock.displayTime();
    }
    
    
    
}
