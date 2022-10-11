import java.util.Arrays;

class Poker{
    static String[] deck = {"cA", "cK", "cQ", "cJ", "c10", "c9", "c8", "c7", "c6", "c5", "c4", "c3", "c2",  // Clovers
                          "pA", "pK", "pQ", "pJ", "p10", "p9", "p8", "p7", "p6", "p5", "p4", "p3", "p2",    // Pickes
                          "hA", "hK", "hQ", "hJ", "h10", "h9", "h8", "h7", "h6", "h5", "h4", "h3", "h2",    // Hearts
                          "dA", "dK", "dQ", "dJ", "d10", "d9", "d8", "d7", "d6", "d5", "d4", "d3", "d2"};   // Diamonds

    static String[][] player_combinations = new String[0][5];
    static String[][] opponent_combinations = new String[0][5];

    public static void main (String[] args) {
        String[] cards = {"c2", "c3", "c4", "c5", "c6", "c7"};
        Poker p = new Poker();      // This statement requires knowledge about Object-Oriented Programming (more in CS2)

        // Example to validate your implementation of method deleteCards
        String[] discard = {"c4", "c6"};
        String[] newCards = p.discard_cards(cards, discard);
        System.out.println(Arrays.toString(newCards));
        {
        // The following call must print the following combination (order of the elements inside the combination does not matter):
        //  "c2", "c3", "c5", "c6", "c7"

        // Example to validate your implementation of method possible_hands
        /** 
        WAIT THIS SHOULD BE REAL CODE !!!!p.possible_hands(cards, new String[0]);
        // The following call must print the following combinations (order of combinations and/or elements inside the combinations do not matter):
        //  "c2", "c3", "c4", "c5", "c6"
        //  "c2", "c3", "c4", "c5", "c7"
        //  "c2", "c3", "c4", "c6", "c7"
        //  "c2", "c3", "c5", "c6", "c7"
        //  "c2", "c4", "c5", "c6", "c7"
        //  "c3", "c4", "c5", "c6", "c7"
        THIS ALSO WHAT THE FUCKSystem.out.println(Arrays.deepToString(Poker.player_combinations));

        // Example to validate your implementation of method possible_hands_opponent
        
        String[] cardsOnCommunity = {"c2", "c3", "c4"};
        String[] cardsAvailable = {"c2", "c3", "c4", "c5", "c6", "c7"};
        p.possible_hands_opponent(cardsAvailable, cardsOnCommunity, new String[0]);
        // The following call must print the following combinations (order of combinations and/or elements inside the combinations do not matter):
        //  "c2", "c3", "c4", "c5", "c6"
        //  "c2", "c3", "c4", "c5", "c7"
        //  "c2", "c3", "c4", "c6", "c7"
        System.out.println(Arrays.deepToString(Poker.opponent_combinations));
        **/
        }
    }

    public String[] discard_cards(String[] initialCards, String[] cardsToDiscard) {
        // Write your code below
        System.out.println(Arrays.toString(initialCards));
        if (cardsToDiscard.length == 0){
            System.out.println("should be zero");
            return initialCards;
        }
        else if (initialCards[0].equals(cardsToDiscard[0])){
            String[] finisher = new String [initialCards.length-1];
            System.arraycopy(initialCards, 1, finisher, 0, initialCards.length-1);
            String[] newCardsDisc = new String [cardsToDiscard.length-1];

            System.arraycopy(cardsToDiscard, 1, newCardsDisc, 0, newCardsDisc.length);
            System.out.println("first card was found");
            System.out.println(Arrays.toString(finisher));

            //trying to find call the next recursion if the first card is found 
            //Problem: just itterating over the array that is left fter finding the first card eg{4,5,6} but should go someway back over {1,2,4,5,6,7}
            //This is the way I used recursion in the else statement
            String[] recursionCards = new String [initialCards.length-1];
            System.arraycopy(initialCards, 1, recursionCards, 0, initialCards.length-1);
            recursionCards = discard_cards(recursionCards, cardsToDiscard);

            return recursionCards;
        
        }else{
            System.out.println("else statement was called!!!");
            String[] recursionCards = new String [initialCards.length-1];
            
            System.arraycopy(initialCards, 1, recursionCards, 0, initialCards.length-1);
            System.out.println(Arrays.toString(initialCards));
            System.out.println(Arrays.toString(recursionCards));
            recursionCards = discard_cards(recursionCards, cardsToDiscard);
            System.arraycopy(recursionCards, 0, initialCards, 1, recursionCards.length);
            return initialCards;
            //return discard_cards(recursionCards, cardsToDiscard);
        }


        // Write your code above
    }
    /** 
    public void possible_hands (String[] cardsAvailable, String[] cardsOnHands) {
        // Write your code below



        // Write your code above
    }

    public void possible_hands_opponent (String[] cardsAvailable, String[] cardsOnCommunity, String[] cardsOnHands) {
        // Write your code below


        
        // Write your code above
    }
    **/

}