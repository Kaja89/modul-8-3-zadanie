package com.kodilla.modul83zadanie.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.propablyIWillThrowException(2, 7);
        } catch(Exception e){
            System.out.println("There is some problem with your numbers");
        } finally{
            System.out.println("The end");
        }
    }
}
