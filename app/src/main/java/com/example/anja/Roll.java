package com.example.anja;

public class Roll implements Bread{
    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public String calories() {
        return ":75kcal";
    }
}