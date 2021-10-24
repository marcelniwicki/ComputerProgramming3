
public class calculation
{
   static int i;
   static int numberOfItems(int x, int y){
       System.out.println("Number of items in range between " + x + " to " + y + " is :");
       for (i = x; i <= y; i++) {
           System.out.println(i);
        }
        return i;
   }
   
   
   static int sum = 0;
   static int sumOfNumbers(int x, int y){
        System.out.println("Sum of numbers in range between " + x + " to " + y + " is :");
        for (i = x; i <= y; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    return sum;
   }
   
   static int count = 0;
   static int sum1 = 0;
   static double meanOfNumbers(int x, int y){
   System.out.println("Arithmetic mean of the numbers in range between " + x + " to " + y + " is :");
        for (i = x; i <= y; i++) {
            sum1 = sum1 + i;
        }
        count = y-x+1;
        System.out.println(sum1/count);   
        return count;
   }
   
   public static void main(String[] args){
       int numberOfItems = numberOfItems(5, 10);
       int sumOfNumbers = sumOfNumbers(5, 10);
       double meanOfNumbers = meanOfNumbers(5, 10);
    }
   
   
   
   
}