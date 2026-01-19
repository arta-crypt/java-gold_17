package com.javagold17.knowledge.enumclass;

public class Main {
    public static void main(String[] args) {
        Card card = Card.SPADES;
        switch (card) {
            case SPADES:
            case CLUBS:
                System.out.println("black");
                break;
            case HEARTS:
            case DIAMONDS:
                System.out.println("red");
        }
        System.out.println("card: " + card);
    }
}
