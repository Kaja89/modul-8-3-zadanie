package com.kodilla.modul83zadanie.test;

public class SecondChallenge {
    public String propablyIWillThrowException(double x, double y) throws Exception{
        if(x>=2 || x<1 || y==1.5){
            throw new Exception();
        }
        return "Done!";
    }
}