

public class convertingTemp
{
  static double celsiusToKelvin(double temp){
      return temp = temp + 273.15;
  }
  
  static double kelvinToCelsius(double temp){
      return temp = temp - 273.15;
  }
  
  static double celsiusToFahrenheit (double temp){
      return temp = 1.8 * temp + 32;
  }
  
  static double fahrenheitToCelsius (double temp){
      return temp = 5.0/9.0 * (temp - 32);
  }
  
  static double kelvinToFahrenheit (double temp){
      return temp = (temp - 273.15) * 1.8 + 32;
  }
  
  static double fahrenheitToKelvin (double temp){
      return temp = (temp - 32)/1.8 + 273.15;
  }
  
  public static void main(String[] args){
        double celsiusToKelvin = convertingTemp.celsiusToKelvin(25);
        double celsiusToFahrenheit = convertingTemp.celsiusToFahrenheit(25);
        double fahrenheitToCelsius = convertingTemp.fahrenheitToCelsius(100);
        double fahrenheitToKelvin = convertingTemp.fahrenheitToKelvin(100);
        double kelvinToCelsius = convertingTemp.kelvinToCelsius(0);
        double kelvinToFahrenheit = convertingTemp.kelvinToFahrenheit(0);
        System.out.println("25 stopni Celsjusza równe jest: " + celsiusToKelvin + " stopni Kelvina i " + celsiusToFahrenheit + " stopni Fahrenheita"
        + "\n100 stopni Fahrenheita równe jest: " + fahrenheitToCelsius + " stopni Celsjusza i " + fahrenheitToKelvin + " stopni Kelvina"
        + "\n0 stopni Kelvina równe jest: " + kelvinToCelsius + " stopni Celsjusza i " + kelvinToFahrenheit + " stopni Fahrenheita");
    }
  
    
    
    
    
}
