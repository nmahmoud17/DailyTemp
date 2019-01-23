package com.company;

public class Temperature {

    private double fahrenheit;
    private double celsius;

    public void setFahrenheit(double userFahrenheitTemp) {
        fahrenheit = userFahrenheitTemp;
    }

    public double getFahrenheit(){
        return fahrenheit;
    }

    public double calculateFahrenheitCelsius() {
        celsius = (fahrenheit - 32) / 1.8;
        return celsius;

    }
}
