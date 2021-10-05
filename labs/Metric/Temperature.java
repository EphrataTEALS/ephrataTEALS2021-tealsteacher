package labs.Metric;

public class Temperature {

    public static void main(String[] args) {

        // Input a temperature in Fahrenheit

        double fahrenheit = -40;
        double  celsius = -40;
        
        // Calcuate temperature in Celsius

        double convertToCelsius = (fahrenheit - 32) * 5.0/9.0;
        double convertToFahrenheit = (celsius * 9.0/5.0) + 32;

        // Output 
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + convertToCelsius + " degrees Celsius");
        System.out.println(celsius + " degrees Celsius is equal to " + convertToFahrenheit + " degrees Fahrenheit");
    }
}