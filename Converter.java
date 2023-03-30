package homework;

public class Converter {

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    public static double convertFahrenheitToFCelsius(double fahrenheit) {

        return fahrenheit * 1.8 - 32;
    }
    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double convertKelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        System.out.println("из Цельсия в Фаренгейты: " + convertCelsiusToFahrenheit(9));
        System.out.println("Из Фаренгейтов в Цельсиии: " + convertFahrenheitToFCelsius(50));
        System.out.println("Из Цельсия в Кельвины: " + convertCelsiusToKelvin(8));
        System.out.println("ИЗ Кельвинов в Фаренгейты: " + convertKelvinToCelsius(285));

    }

}


