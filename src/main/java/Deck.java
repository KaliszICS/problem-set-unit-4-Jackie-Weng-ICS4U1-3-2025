
class Deck {
  private Card[] cards;
  private int size;


  public Deck(Card[] cardsArray) {
    this.size = cardsArray.length;
    this.cards = new Card[size];
    for (int i = 0; i < size; i++) {
      this.cards[i] = cardsArray[i];
    }
  }

public Deck() {
  String[] suits = {"H", "C", "D", "S"};
  String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  this.cards = new Card[52];
  this.size = 0;


  for (int sx = 0; sx < suits.length; sx++) {
    for (int vr = 0; vr < names.length; vr++)  {
