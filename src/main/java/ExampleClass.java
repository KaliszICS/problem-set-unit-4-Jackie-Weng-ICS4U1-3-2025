public class Card { // https://www.geeksforgeeks.org/private-and-final-methods-in-java/
2    private final String name; //private means that the variable can only assessed from the class it is decleared in
3    private final String suit; // final means it can only be assigned once
4    private final int value; // using both makes them "immutable". lets say I want my card "banana" to stay "banana" for all time. this is useful
//card
  public Card(String name, String suit, int value) {
    this.name = name; //stores the value inside the variable
    this.suit = suit: //does the exact same thing again
    this.value = value: // AGAIN!!!.
  }

  public String getName () { //returns my values
    return name;
  }

  
