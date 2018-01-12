package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //X 1-Hello! Please enter your name
        //X 2-Enter your current age
        //X  3- Enter the current calendar year
        // 4-OUTPUT
        // X   -Name
        // X   - Age Next Year (2019 = 2018+1): In 2019, you will be YY years old.
        // X   - Age Next Year (2023 = 2018+5): In 2023, you will be YY years old.
        // X   - Age Next Year (2019 = 2018+10): In 2028, you will be YY years old.

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Please enter your name.");
        String yourName = sc.nextLine();

        System.out.println("Enter your current age.");
        String currentAge = sc.nextLine();

        System.out.println("Enter the current calendar year.");
        String currentYear = sc.nextLine();

        int intAge= Integer.parseInt(currentAge);
        int intYear = Integer.parseInt(currentYear);

        int agePlusone = intAge + 1;
        int agePlusfive = intAge + 5;
        int agePlusten = intAge + 10;

        int yearPlusone = intYear + 1;
        int yearPlusfive = intYear + 5;
        int yearPlusten = intYear + 10;

        System.out.println(yourName + ", you are currently " + currentAge + " years old.");
        System.out.println("In " + yearPlusone + ", you will be " + agePlusone + " years old.");
        System.out.println("In " + yearPlusfive + ", you will be " + agePlusfive + " years old.");
        System.out.println("In " + yearPlusten + ", you will be " +  agePlusten + " years old.");


    }
}
