package com.company;

public class Temperature {

    private double Fahrenheit;
    private double celsius;

    public void setFahrenheit(double fahrenheitTemp) {
        Fahrenheit = fahrenheitTemp;
    }

    public double getFahrenheit(){
        return Fahrenheit;
    }

    public double calculateFahrenheitCelsius() {
        celsius = (Fahrenheit - 32) / 1.8;
        return celsius;

    }
}
