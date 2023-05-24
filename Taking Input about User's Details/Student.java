package com.nabeel;
import java.util.*;
public class Student
{
    static String name,rollnumber;
    static int age;
    public static void takeName()
    {
        System.out.println("Please Enter Your Name.");
        Scanner in = new Scanner(System.in);
        name = in.next();
    }
    public static void printName()
    {
        System.out.print("Your Name is ");
        System.out.print(name);
        System.out.println(".");
    }
    public static void takeRollnumber()
    {
        System.out.println("Please Enter Your Roll Number.");
        Scanner in = new Scanner(System.in);
        rollnumber = in.next();
    }
    public static void printRollnumber()
    {
        System.out.print("Your Rollnumber is ");
        System.out.print(rollnumber);
        System.out.println(".");
    }
    public static void takeAge()
    {
        System.out.println("Please Enter Your Age.");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
    }
    public static void printAge()
    {
        System.out.print("Your Age is ");
        System.out.print(age);
        System.out.println(".");
    }
}
