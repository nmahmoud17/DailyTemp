package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Modify your temperature exercise from lecture today so that your dailyAverageTemp array holds
//        Temperature objects instead of doubles. A Temperature should have (1) property which holds degrees
//        in Fahrenheit. A Temperature should also have a convertToCelsius() method which will convert a
//        temperature from degrees Fahrenheit to degrees Celsius.
//
//        Your program should allow the user to enter (1) week of daily average temperatures, display all the
//        daily average temperatures for a week, and display the weekly average temperature.
//        The user should have the option to display temperatures in Fahrenheit or Celsius.

        Scanner reader = new Scanner(System.in);
        int averageTempArraySize = 7;

        Temperature[] dailyAverageTemp = new Temperature[averageTempArraySize];

        double sum = 0;
        double avg = 0;


        for (int i=0; i <averageTempArraySize; i++) {
            System.out.println("Please enter the daily average temperature " +
                    "(in degrees Fahrenheit) for the last 7 days  ");

            dailyAverageTemp[i]= new Temperature();

            int userInput = reader.nextInt();

            dailyAverageTemp[i].setFahrenheit(userInput);
            dailyAverageTemp[i].getFahrenheit();

            System.out.println(dailyAverageTemp[i].getFahrenheit());

            sum += i;
        }

        avg = sum/averageTempArraySize;

        System.out.println(sum);
        System.out.println(avg);


    }


    }
