package com.harrywork;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, I am reading how to win frends and influence people ");
        for (String celciusInString : args) {
            Double fehrenheit = convertCelciusToFehrenheit(celciusInString);
            if (fehrenheit != null) {
                System.out.println("celcius:" + celciusInString + " -- fehrenheit:" + fehrenheit.doubleValue());
            }
        }
    }

    private static Double convertCelciusToFehrenheit(String celciusInString) {
        try {
            Double celcius = Double.valueOf(celciusInString);
            double farenheit = celcius * 9 / 5 + 32;
            return farenheit;
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
        return null;
    }
}
