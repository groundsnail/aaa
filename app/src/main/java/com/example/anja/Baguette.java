package com.example.anja;

public class Baguette implements Bread{
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return ":65kal";
    }
}
