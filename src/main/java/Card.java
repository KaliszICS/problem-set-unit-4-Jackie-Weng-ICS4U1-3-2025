
final class Card { 
  private  String name; // private means that the variable can only be accessed from the class it is declared in
  private  String suits; // final means it can only be assigned once
  private int value;   // using both makes them "immutable". let's say I want my card "banana" to stay "banana" for all time. this is useful

  
  public Card(String name, String suits, int value) {
    this.name = name;  // stores the value inside the variable
    this.suits = suits;  // does the exact same thing again, 
    this.value = value; // again
  }

  public String getName() { // returns my values
    return name;
  }

  public String getSuits() { // again
    return suits;
  }

  public int getValue() { //again
    return value;
  }

@Override
public String toString() { // string to string combine my names and suits. creates something like "Ace of Hearts" or "King of Spades"
    return name + " of " + suits; // all cards no matter what have a "of" in the middle. 
  }
@Override
public boolean equals(Object obj) {
  if (this == obj) { // i have to use the word "this" for some reason. it just checks if the instance is the same as the object being compared
    return true;
  }

  if (obj == null || getClass() != obj.getClass()) { // checks if its null. if it is it just returns false to me
    return false; // returns false if the check is true,
  } 

  Card card = (Card) obj;
  return value == card.value && name.equals(card.name) && suits.equals(card.suits); // checks if any 2 cards are equal, the value of the card depends on 3 things.
} 
  @Override
  public int hashCode() { //https://kiranukamath.medium.com/understanding-hashcode-and-equals-in-java-9041b1c418ef
    int result = name.hashCode();
    result = 7 * result + suits.hashCode();  // you can use any PRIME NUMBER. I just like the number 7. its the day my dog was born
    result = 7 * result + value; //
    return result;
  }
}


