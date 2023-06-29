package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        System.out.print("Armut kaç kilo : ");
        double armutkilo= scan.nextDouble();


        System.out.print("Elma kaç kilo : ");
        double elmakilo= scan.nextDouble();


        System.out.print("Domates kaç kilo : ");
        double domateskilo= scan.nextDouble();

        System.out.print("Muz kaç kilo : ");
        double muzkilo= scan.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        double patlicankilo= scan.nextDouble();

        double toplam=(armut*armutkilo)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo);
        System.out.print("Toplam tutar :" +toplam);

        }

}