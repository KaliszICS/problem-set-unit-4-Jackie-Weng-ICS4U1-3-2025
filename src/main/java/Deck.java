//import
class Deck {
  private Card[] cards;
  private int cardslengths;


  public Deck(Card[] cardsArray) {
    this.cardslengths = cardsArray.length;x
    this.cards = new Card[cardslengths];
    for (int i = 0; i < cardslengths; i++) {
      this.cards[i] = cardsArray[i];
    }
  }

public Deck() {
  String[] suits = {"H", "C", "D", "S"};
  String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  this.cards = new Card[52];
  this.cardslengths = 0;


  for (int sx = 0; sx < suits.length; sx++) {
    for (int vr = 0; vr < names.length; vr++)  {
      cards[cardslengths++] = new Card(names[vr], suits[sx], vr + 1);
    }
  }
}

public int cardslengths() {
  return cardslengths;
}

public Card drawingcards() {
  if (cardslengths == 0) {
    return null;
  }
 
Card topCard = cards[0];
for (int ysd = 1; ysd < size; ysd++) {
  cards[ysd - 1] = cards[ysd]; 
  }
}

public void shufflecards() {
  for (int ysd = size)