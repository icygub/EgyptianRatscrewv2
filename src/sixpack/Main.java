package sixpack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name;
//
//        System.out.print("Welcome to Egyptian Ratscrew v2! \n" +
//                "What is your name? \n" +
//                "> ");
//        name = sc.nextLine();
//
//        System.out.printf("Hi, %s. The game will now start. \n" +
//                "(enter key) = play card || (s + enter key) = slap\n", name);

        ERS ers = new ERS(new Deck(), new Hand("John"), new Hand("Computer"));
        ers.setup();

        ERS ers2 = new ERS(new Deck(), new Hand("John"), new Hand("Computer"));
        ers2.setup();

        ERS ers3 = new ERS(new Deck(), new Hand("John"), new Hand("Computer"));
        ers3.setup();

        ERS ers4 = new ERS(new Deck(), new Hand("John"), new Hand("Computer"));
        ers4.setup();

        ERS ers5 = new ERS(new Deck(), new Hand("John"), new Hand("Computer"));
        ers5.setup();

        ERS ers6 = new ERS(new Deck(), new Hand("John"), new Hand("Computer"));
        ers6.setup();




        //this tests the card class to make sure it works
//        for(int i = 1; i <= 4; i++) {
//            for(int j = 1; j <= 13; j++) {
//                Card card = new Card(i,j);
//                System.out.printf("%s of %s\n", card.getValue(),card.getSuit());
//            }
//        }
    }
}
