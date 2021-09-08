package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
	// write your code here
        var reader = new Scanner(System.in);
        System.out.print("How old are you:");
        var age = reader.nextFloat();
        var dogyears = age*7;
        System.out.println("Wow you are "+age+" thats "+dogyears+" in dog years!");
    }
}
