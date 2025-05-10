//import java.util.ArrayList; not needed as im not merging any 2 decks together. regular arrays are just fine.

/* my deck class is just a normal standard deck of fully virtual cards */
/* shuffles the cards without imports with math.random */
/* cardcount: the # of cards in the deck.  */
/* Also immutable, i cant modify anything */
class Deck { 
  private Card[] cards; 
  private int cardcount;  // size is just  how many cards I have

//* String Arrays of suits and names */
//* each card has a suit, a name and a value! */
 
//creating a new array with methods from unit 1
//* 53 total amount of cards in a deck */
public Deck() {
  String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"}; // simple array 
  String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //simple array.
  int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; // the 13 values, Ace through king
  
  // this.cards = new Card[52]; // too Hard coded, 
  
  cards = new Card[suits.length * names.length]; // you could hardcode it like the comment above, but you could also just mulitply them to get 52
  cardcount = 0; // starts at zero cards 

 
  
/* looping */
  for (int x = 0; x < suits.length; x++) { // loops though each and every suit 
    for (int y = 0; y < names.length; y++)  {  
      int value = values[y];
      cards[cardcount++] = new Card(names[y], suits[x], value); 
    }
  }
}


/* @param Cardsarray, an array of cards */
/* create a "deck" from a array of cards */

  public Deck(Card[] cardsArray) {
    cardcount = cardsArray.length; // from unit one. this simply just sets the number of cards of size of array.
    cards = new Card[cardcount];  // creates a new array 
    for (int i = 0; i < cardcount; i++) { 
      cards[i] = cardsArray[i]; // copys the random array
    }
  }



/* @return the cards remaing */

public int cardcount() { 
  return cardcount; 
}



/* @return, the top card if there is one, otherwise you get a null */

public Card draw() {
  if (cardcount == 0) { // checks if you have 0 cards, if you have zero cards, you arent playing anymore. 
    return null; 
  }




//*finding top card using a stack approach (familiar to the tower of hanoi) *//
Card topCard = cards[--cardcount]; // decreases size and get the card at the new index, which is the "top" card
 cards[cardcount] = null; // you dont have to do this, but if you set the postion to null it saves a bit on memory
 return topCard; // return the top card that was drawn. 
  }
  




/* Use Math.random to shuffle cards, */
/* randomly swaps each card from end of array to front */



public void shuffle() { // shuffle class using math.random.
  for (int y = cardcount - 1; y > 0; y--) { // from unit one. starts the last index of the array and move backwards
    int s = (int)(Math.random() * (y + 1)); // also from unit 1. math.random returns a double value
    Card temp = cards[y]; // temp stores the card and index y
    cards[y] = cards[s]; // randomly swaps them.
    cards [s] = temp; // swaps the card at index dsy with the temp card above.
    }
  }
}