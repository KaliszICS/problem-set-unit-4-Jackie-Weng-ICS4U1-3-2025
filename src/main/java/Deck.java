import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
final class Card { // https://www.geeksforgeeks.org/private-and-final-methods-in-java/
  private  String name; // private means that the variable can only be accessed from the class it is declared in
  private  String types; // final means it can only be assigned once
  private int value;   // using both makes them "immutable". let's say I want my card "banana" to stay "banana" for all time. this is useful

  
  public Card(String name, String types, int value) {
    this.name = name;  // stores the value inside the variable
    this.types = types;  // does the exact same thing again, 
    this.value = value; // AGAIN!!!
  }

  public String getName() { // returns my values
    return name;
  }

  public String getTypes() { // AGAIN!!!
    return types;
  }

  public int getValue() { //AGAIN!!! 
    return value;
  }

@Override
public String toString() {
    return name + " of " + types;
  }
@Override
public boolean equals(Object obj) {
  if (this == obj) { // i have to use the word "this" for some reason. it just checks if the instance is the same as the object being compared
    return true;
  }

  if (obj == null || getClass() != obj.getClass()) {
    return false;
  }

  Card card = (Card) obj;
  return value == card.value && name.equals(card.name) && types.equals(card.types);
} 
  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 7 * result + types.hashCode();  // you can use any PRIME NUMBER. I just like the number 7. its the day my dog was born
    result = 7 * result + value;
    return result;
  }
}



class Deck {
  private List<Card> cards;

  
  public Deck(Card[] cardsArray) {
    this.cards = new ArrayList<>();
    Collections.addAll(this.cards, cardsArray); //https://www.geeksforgeeks.org/java-util-arraylist-addall-method-java/
  }

  public Deck() {
    this.cards = new ArrayList<>();
    String[] types = {"H", "C", "D", "S"};
    String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    for (String type : types) {
      for (int value = 0; value < names.length; value++) {
        cards.add(new Card(names[value], type, value + 1));
      }
    }
  }


  public int size() {
    return cards.size();
  }

  public Card draw() {
    if (cards.isEmpty()) { //https://www.w3schools.com/java/ref_string_isempty.asp
      return null;
    }
    return cards.remove(0);
  }

  public void shuffle() { 
    for (int i = cards.size() - 1; i > 0; i--) {
      int x = (int)(Math.random() * (i+1));
      Card temp = cards.get(i);
      cards.set(i, cards.get(j));
      cards.set(j,temp);
    }
  }

    //Collections.shuffle(cards); 
  

  public String toString() {
    return cards.toString();
  }
 }
