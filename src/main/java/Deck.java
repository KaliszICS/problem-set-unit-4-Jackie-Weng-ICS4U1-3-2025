//import
class Deck { 
  private Card[] cards; //simple array. our "cards"
  private int cardslengths; // from unit one. tracks our cardlength or how many are currently in the deck.


  public Deck(Card[] cardsArray) {
    this.cardslengths = cardsArray.length; // from unit one. this simply just sets the number of cards of size of array.
    this.cards = new Card[cardslengths];  // creates a new array just like in unit one.
    for (int i = 0; i < cardslengths; i++) { 
      this.cards[i] = cardsArray[i]; // copys the random array or technically the cards
    }
  }

public Deck() {
  String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"}; // simple array for the suits
  String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //simple array.
  this.cards = new Card[52]; // 52 gives us just enough space for all cards. 4 suits 13 cards gives us just enough of 52 cards.
  this.cardslengths = 0; // starts at zero cards first just in case.
 

  for (int sx = 0; sx < suits.length; sx++) { // loops though each suit from line 17.
    for (int vr = 0; vr < names.length; vr++)  { // does the exact same thing but for the names now. 
      cards[cardslengths++] = new Card(names[vr], suits[sx], vr + 1); // add a new card to my deck and tracks how many times one was added. without this you would eventually run outta cards.
    }
  }
}

public int cardsize() {
  return cardslengths; // does exactly as it says. returns my cards sizes
}

public Card drawingcards() {
  if (cardslengths == 0) { // checks if you have 0 cards, if you have zero cards, you arent playing anymore. this checks if you do and returns null.
    return null;
  }
 
Card topCard = cards[0]; // 0 aka my top card in my array or the first in the array
for (int ysd = 1; ysd < cardslengths; ysd++) {
  cards[ysd - 1] = cards[ysd]; //shifts every card one
  }
  cards[--cardslengths] = null; // decreases size
  return topCard; // returns my top card or the one that was removed in the last line
}


public void shufflecards() { //you could prob simpify this by using the shuffle method in java already. but you need a import
  for (int ysd = cardslengths - 1; ysd > 0; ysd--) { // from unit one. starts the last index of the array and move backwards
    int dsy = (int)(Math.random() * (ysd + 1)); // also from unit 1. math.random returns a double value
    Card temp = cards[ysd]; // temp stores the card and index ysd
    cards[ysd] = cards[dsy]; // randomly swaps them.
    cards [dsy] = temp;
  }
}
} 