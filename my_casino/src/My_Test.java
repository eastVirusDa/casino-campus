import java.util.Scanner;

public class My_Test {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Scanner input = new Scanner(System.in);
        deck.shuffleDeck();

        for(Card c : deck.cards){
            System.out.print(c);
        }

        System.out.println();
        while(true){
            if(input.hasNextLine()){
                System.out.println(deck.pickCard());
            }

        }
    }
}
