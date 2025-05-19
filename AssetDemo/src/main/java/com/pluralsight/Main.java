package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Portfolio p = new Portfolio("Abdul's  Portfolio", "Abdul");
        CreditCard creditCard = new CreditCard();
        creditCard.charge(2000);

        p.add(new Gold(1));

        p.add(new Jewelry("Necklace", 2));
        p.add(new House(2000, 2500,2));
        p.add(creditCard);

        System.out.println("The total value of the portfolio is " + p.getValue());

    }
}