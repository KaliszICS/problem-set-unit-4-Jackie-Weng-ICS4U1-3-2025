//
final class Card { 
  private  final String name; // private means that the variable can only be accessed from the class it is declared in
  private final String suits; // final means it can only be assigned once
  private final int value;   // using both makes them "immutable". let's say I want my card "banana" to stay "banana" for all time. this is useful

  
  public Card(String name, String suits, int value) {
    this.name = name;  // stores the value inside the variable
    this.suits = suits;  
    this.value = value; 
  }

  public String getName() { // returns my values
    return name; // you can either return name or this.name. As long as you stay consistent it doesn't really matter
  }

  public String getSuits() {  
    return suits;
  }

  public int getValue() { 
    return value;
  }

@Override
public String toString() { // string to string combine my names and suits. creates something like "Ace of Hearts" or "King of Spades"
    return name + " of " + suits; // all cards no matter what have a "of" in the middle. 
  }
@Override
public boolean equals(Object obj) { 
  if (obj == null || getClass() != obj.getClass()) { // checks if its null. if it is it just returns false to me
    return false; // instead of crashing it returns false. 
  } 
  //checking memory just in case
  if (this == obj) { // it just checks if the instance is the same as the object being compared
    return true; 
  } 

  Card card = (Card) obj; // first casting the obj to a card. you cant compare cards if one isnt a card.
  return value == card.value && name.equals(card.name) && suits.equals(card.suits); // checks all 3 fields
} 
  }



