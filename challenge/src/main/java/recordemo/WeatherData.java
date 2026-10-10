package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (temperatureCelsius*9/5)+32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather : %.1fC (%.1fF) and %s",temperatureCelsius,temperatureFahrenheit(),conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tmpC=((tempFahrenheit-32)*5)/9;
        return new WeatherData(tmpC,conditions);
    }

    public static void main(String[] args) {
        System.out.print("Today's Weather : ");
        WeatherData d1=new WeatherData(25,"Sunny");
        System.out.println(d1.getSummary());
        System.out.print("Yesterday's Weather : ");
        System.out.println(fromFahrenheit(50,"Cloudy").getSummary());
    }
}
