package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
        return value / 90; // Assuming the cinversion rate is 1 Euro = 90 Rybles
    }
    public static double rubleToDollar(double value) {
        return value / 75; // Assuming the cinversion rate is 1 Dollar = 75 Rubles
    }
}
