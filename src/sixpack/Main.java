package sixpack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("Welcome to Egyptian Ratscrew v2! \n" +
                "What is your name? \n" +
                "> ");
        name = sc.nextLine();

        ERS ers = new ERS(new Deck(), new Hand("John", false), new Hand("Computer", true));
        ers.setup();


        //this tests the card class to make sure it works
//        for(int i = 1; i <= 4; i++) {
//            for(int j = 1; j <= 13; j++) {
//                Card card = new Card(i,j);
//                System.out.printf("%s of %s\n", card.getValue(),card.getSuit());
//            }
//        }

//        this checks run time
//        Date date1 = new Date();
//        long startTime = date1.getTime();
//        Date date2 = new Date();
//        long endTime = date2.getTime();
//        long totalTime = Math.abs(startTime - endTime);
//        System.out.println(startTime);
//        System.out.println(endTime);
//        System.out.printf("Total time: %d", totalTime);
//        System.out.println("\n==========\n==========\n===========\n");

    }
}
