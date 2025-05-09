//import java.util.ArrayList; 
class Deck { 
  private Card[] cards; 
  private int size;  // size is just  how many cards I have

 //creating a new array with methods from unit 1
public Deck() {
  String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"}; // simple array 
  String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //simple array.
  int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; // the 13 values, Ace through king
  // this.cards = new Card[52]; // too Hard coded
  cards = new Card[suits.length * names.length]; // you could hardcode it like the line above, but you could also just mulitply them to get >=53
  size = 0; // starts at zero cards 
 
//looping
  for (int x = 0; x < suits.length; x++) { // loops though each and every suit 
    for (int y = 0; y < names.length; y++)  {  
      int value = values[y];
      cards[size++] = new Card(names[y], suits[x], value); 
    }
  }
}



  public Deck(Card[] cardsArray) {
    size = cardsArray.length; // from unit one. this simply just sets the number of cards of size of array.
    cards = new Card[size];  // creates a new array 
    for (int i = 0; i < size; i++) { 
      cards[i] = cardsArray[i]; // copys the random array
    }
  }


public int size() { 
  return size; 
}

public Card draw() {
  if (size == 0) { // checks if you have 0 cards, if you have zero cards, you arent playing anymore. 
    return null; 
  }
//finding top card using a stack approach simiarly to the tower of hanoi
Card topCard = cards[--size]; // decreases size and get the card at the new index, which is the "top" card
 cards[size] = null; // you dont have to do this, but if you set the postion to null it saves a bit on memory
 return topCard; // return the top card that was drawn. 
  }
  

// using math.random and loops to "shuffle cards"
public void shuffle() { // shuffle class using math.random.
  for (int y = size - 1; y > 0; y--) { // from unit one. starts the last index of the array and move backwards
    int s = (int)(Math.random() * (y + 1)); // also from unit 1. math.random returns a double value
    Card temp = cards[y]; // temp stores the card and index y
    cards[y] = cards[s]; // randomly swaps them.
    cards [s] = temp; // swaps the card at index dsy with the temp card above.
    }
  }
}