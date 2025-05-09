//import java.util.ArrayList; 
class Deck { 
  private Card[] cards; 
  private int size;  

  
public Deck() {
  String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"}; // simple array 
  String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //simple array.
  int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; // the 13 values, Ace through king
  this.cards = new Card[52]; // 4 suits of 13 cards gives us 52 cards.
  this.size = 0; // starts at zero cards 
 

  for (int x = 0; x < suits.length; x++) { // loops though each and every suit 
    for (int y = 0; y < names.length; y++)  {  
      int value = values[y];
      cards[size++] = new Card(names[y], suits[x], value); 
    }
  }
}



  public Deck(Card[] cardsArray) {
    this.size = cardsArray.length; // from unit one. this simply just sets the number of cards of size of array.
    this.cards = new Card[size];  // creates a new array 
    for (int i = 0; i < size; i++) { 
      this.cards[i] = cardsArray[i]; // copys the random array
    }
  }


public int cardsize() { 
  return size; 
}

public Card drawingcards() {
  if (size == 0) { // checks if you have 0 cards, if you have zero cards, you arent playing anymore. 
    return null;
  }
 
Card topCard = cards[0]; // "0" is my top card in my array 
for (int y = 1; y < size; y++) {
  cards[y - 1] = cards[y]; //shifts every card one
  }
  cards[--size] = null; // reduce cards by one and sets it to null
  return topCard; // returns my top card or the one that was removed in the last line
}


public void shufflecards() { // shuffle class using math.random.
  for (int y = size - 1; y > 0; y--) { // from unit one. starts the last index of the array and move backwards
    int s = (int)(Math.random() * (y + 1)); // also from unit 1. math.random returns a double value
    Card temp = cards[y]; // temp stores the card and index y
    cards[y] = cards[s]; // randomly swaps them.
    cards [s] = temp; // swaps the card at index dsy with the temp card above.
    }
  }
}