package org.example.helloworld;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("please enter a number: ");
        Scanner s=new Scanner(System.in);
        String answer=s.nextLine();
        System.out.println("welcome " +answer);
    }
}
