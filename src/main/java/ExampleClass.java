import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
public class Card { // https://www.geeksforgeeks.org/private-and-final-methods-in-java/
  private final String name; // private means that the variable can only be accessed from the class it is declared in
  private final String types; // final means it can only be assigned once
  private final int value;   // using both makes them "immutable". let's say I want my card "banana" to stay "banana" for all time. this is useful

  
  public Card(String name, String types, int value) {
    this.name = name;  // stores the value inside the variable
    this.types = types;  // does the exact same thing again, 
    this.value = value; // AGAIN!!!
  }

  public String getName() { // returns my values
    return name;
  }

  public String gettypes() { // AGAIN!!!
    return types;
  }

  public int getValue() { //AGAIN!!! 
    return value;
  }
}

public String toString() {
    return name + " of " + types;
}

public boolean equals(Object obj) {
  if (this == obj) { // i have to use the word "this" for some reason. it just checks if the instance is the same as the object being compared
    return true;
  }

  if (obj == null || getClass() != obj.getClass()) {
    return false;
  }

  public int hashCode() {
    int result = name.hashCode();
    result = 7 * result + types.hashCode();  // you can use any PRIME NUMBER. I just like the number 7. its the day my dog was born
    result = 7 * result + value;
    return result;
  }
}


public class Deck {
  private List<Card> cards;

  
  public Deck(Card[] cardsArray) {
    this.cards = new ArrayList<>();
    Collections.addAll(this.cards, cardsArray);
  }

  public Deck() {
    this.cards = new ArrayList<>();
    String[] types = {"H", "C", "D", "S"};
    String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
