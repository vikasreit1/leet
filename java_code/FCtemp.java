import java.util.Scanner;
 
public class FCtemp {
//Celsius to Fahrenheit and Back
    
    static double fahrenheit;
    static double celsius;
    
    public static void main(String[] args) {
        
//Variable
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please Enter the Fahrenheit Temperature: " );
        
        fahrenheit = sc.nextDouble();
         
        System.out.print("Please Enter the Celsius Temperature: ");
        celsius = sc.nextDouble();
        
        System.out.println("--------------------------------------");
        
        fahrenheitToCelsius(fahrenheit);
        
        celsiusToFahrenheit(celsius);
        
    }
    
    /** Converts from Fahrenheit to Celsius*/
    static void fahrenheitToCelsius(double f) {
        
        double c = ((f - 32.0)/9.0)*5.0;
        
        System.out.println(f + " Fahrenheit == " + c + " Celsius");
    }
    
    /** Converts from Celsius to Fahrenheit*/
    static void celsiusToFahrenheit(double c) {
        double f = ((9.0 / 5) * c) + 32;
        
        System.out.println(c + " Celsius    == " + f + " Fahrenheit");
    }
    
}