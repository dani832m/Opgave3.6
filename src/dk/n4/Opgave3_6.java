package dk.n4;

import java.util.Scanner; // Importerer klassen Scanner fra java.util

public class Opgave3_6 {

    public static void main(String[] args) { // Kører vores main metode

        double weight; // Deklarerer variablen weight
        double height; // Deklarerer variablen height
        double bmi; // Deklarerer variablen bmi

        System.out.println("Her kan du udregne dit Body Mass Index."); // Udskriver tekst

        Scanner input = new Scanner(System.in); // Fortæller at vores Scanner input er en ny scanner

        System.out.print("Indtast kropsvægt i kilo: "); // Udskriver tekst

        weight = input.nextDouble(); // Fortæller at variablen weight svarer til næste brugerindtstning i konsollen

        System.out.print("Indtast højde i meter: "); // Udskriver tekst

        height = input.nextDouble(); // Fortæller at variablen height svarer til næste brugerindtastning i konsollen

        System.out.print("Dit BMI er: "); // Udskriver tekst

        bmi = weight / (height * height); // Udregner BMI på baggrund af de brugerindtastede data (doubles)

        System.out.println(bmi); // Udskriver indholdet af variablen BMI

        if (bmi < 18.5) { // Starter if-statement. Hvis BMI er under 18,5 udprintes tekst
            System.out.println("Skinny dude! Få din vægt op!"); // Teksten der udprintes
        } else if (bmi >= 18.5 && bmi <= 24.9) { // Hvis BMI er større end eller lig 18,5 og mindre end eller lig 24,9 udprintes tekst
            System.out.println("Alt er godt. Du er normalvægtig."); // Teksten der udprintes
        } else if (bmi >= 25.0 && bmi <= 29.9) { // Hvis BMI er større end eller lig med 25,0 og mindre end eller lig 29,9 udprintes tekst
            System.out.println("Damn dude! Du er overvægtig!"); // Teksten der udprintes
        } else if (bmi >= 30.0 && bmi <= 40.0) { // Hvis BMI er større end eller lig 30,0 og mindre end eller lig 40,0 udprintes tekst
            System.out.println("Wow! Du er regulært fed!"); // Teksten der udprintes
        } else if (bmi > 40.0) { // Hvis BMI er over 40,0 udprintes tekst
            System.out.println("Wow! Du er regulært fed!"); // Teksten den udprintes
        } else { System.out.println("Fejl"); } // Hvis ingen af kriterierne opfyldes, udskrives teksten "Fejl" (til debugging)

    }

}