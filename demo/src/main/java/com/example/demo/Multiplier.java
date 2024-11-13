package com.example.demo;
import org.springframework.stereotype.Component;
@Component
public class Multiplier implements Operation {
public double getResult (double a, double b) {
    return a * b;
}
}
