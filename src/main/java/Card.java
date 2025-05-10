/* Class is "immutable" I cant change anything*/

/* Giving playing cards a name, suit and their value */

final class Card { 
  private  final String name; // private means that the variable can only be accessed from the class it is declared in
  private final String suits; // final means it can only be assigned once


  private final int value;   // each card has their own values, a ace is worth 1 which is like nothing while a king is worth 13
/* 
 * @param Name, the name of the card. 
 * @param Suit, the suit/categories of the card
 * @param Value, the hierarchy of the card/how much the card is worth compared to others
 */
  
  

  public Card(String name, String suits, int value) {
    this.suits = suits; 
    
    this.name = name;  // stores the value inside the variable
     
    this.value = value; 
  }



/* @return suit as a string so its actually readable */

  public String getSuits() {  
    return suits;
  }



/* @return return the name of the card also as a string */
  public String getName() { // returns my values
    return name; // you can either return name or this.name. As long as you stay consistent it doesn't really matter
  }



  /* @return return value of the card */

  public int getValue() { 
    return value;
  }


/* @return return the full name of the card */



@Override
public String toString() { //  creates something like "Ace of Hearts" or "King of Spades"
    return name + " of " + suits; // all cards no matter what have a "of" in the middle. 
  }
  /* @param obj, something to compare each card with */



@Override
public boolean equals(Object obj) { 
  if (obj == null || getClass() != obj.getClass()) { // checks if its null. if it is it just returns false 
    return false; // instead of crashing because of the null it returns false
 
  } 
  //checking memory just in case
  if (this == obj) { // it just checks if the instance is the same as the object being compared
    return true; 
  } 


  Card card = (Card) obj; // first casting the obj to a card. you cant compare cards if one isnt a card.
  return value == card.value && name.equals(card.name) && suits.equals(card.suits); // checks all 3 fields
} 
  }



