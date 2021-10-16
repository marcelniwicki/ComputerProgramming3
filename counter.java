

public class counter
{
    int counter = 0;
    
    void increaseByOne(){
        counter += 1;
    }
    
    void decreaseByOne(){
        counter -= 1;
    }
    
    void increaseByTen(){
        counter += 10;
    }
    
    void decreaseByTen(){
        counter -= 10;
    }
    
    void resetCounter(){
        counter = 0;
    }
    
    void displayCounter(){
        System.out.println("Current counter state: " + counter);
    }
    
}
