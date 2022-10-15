import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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
        String[] discard = {"c4", "c9"};
        String[] newCards = p.discard_cards(cards, discard);
        System.out.println("yep this is wrong " + Arrays.toString(newCards));
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
        ArrayList<String> listInitialCards = Array2ArrayList(initialCards);
        ArrayList<String> listCardsToDiscard = Array2ArrayList(cardsToDiscard);
        if(cardsToDiscard.length == 0){
            return initialCards;
        }else{


            for(int i = 0; i < initialCards.length; i++){
                if (initialCards[i] == cardsToDiscard[0]) {
                    //System.out.println("s"+initialCards[i]+cardsToDiscard[0]);

                    listInitialCards.remove(cardsToDiscard[0]);
                    //initialCards = ArrayList2Array(listInitialCards);

                    if (cardsToDiscard.length > 1) {

                        listCardsToDiscard.remove(cardsToDiscard[0]);
                        //System.out.println(listCardsToDiscard);
                        //System.out.println(listInitialCards);
                        //cardsToDiscard = ArrayList2Array(listCardsToDiscard);
                    }
                }if(i == initialCards.length -1){
                    listCardsToDiscard.remove(cardsToDiscard[0]);

                }
                System.out.println(Arrays.toString(initialCards));
            }
            initialCards = ArrayList2Array(listInitialCards);
            cardsToDiscard = ArrayList2Array(listCardsToDiscard);
            System.out.println("final");
            return discard_cards(initialCards, cardsToDiscard);
        }



        // Write your code above
    }
    public static ArrayList<String> Array2ArrayList(String[] array) {
        return new ArrayList<String>(Arrays.asList(array));
    }
    public static String[] ArrayList2Array(ArrayList<String> strList) {
        String[] array = strList.toArray(new String[0]);
        return array;
    }
    public void possible_hands (String[] cardsAvailable, String[] cardsOnHands) {
        // Write your code below
        System.out.println("this is done on the laptop from eliasubz and in the arrallist branch");
        System.out.println("lets see where it will be");


        // Write your code above
    }
    /**

     public void possible_hands_opponent (String[] cardsAvailable, String[] cardsOnCommunity, String[] cardsOnHands) {
        // Write your code below


        
        // Write your code above
    }
    **/

}