
public class SurfaceArea
{
    static double circleArea(double r){
        return 3.14*r*r;
    }
    
    static double rectangleArea(double a, double b){
        return a*b;
    }
    
    static double triangleArea(double a, double h){
        return 0.5*a*h;
    }
    
    public static void main(String[] args){
        double circleArea = SurfaceArea.circleArea(4);
        System.out.println("Pole kola o promieniu 4 wynosi: " + circleArea);
    }
    
    
    
    
    
}
