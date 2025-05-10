/* Jackie Weng ISU4U
 *J. Kalisz
 /* First Problem Set (Cards). */
/* Class is "immutable" I cant change anything.*/
/* Fri May 9th.  */
/* Giving playing cards a name, suit and their value. */

final class Card { 
  private  final String name; // private means that the variable can only be accessed from the class it is declared in
  
  private final String suits; // final means it can only be assigned once


  private final int value;   // each card has their own values, a ace is worth 1 which is like nothing while a king is worth 13
/* 
 * Creating a card with 3 thing
 * * @param Suit, the suit/categories of the card. Something like a Heart or a spade
 * @param Name, the name of the card. something like a King or a Ace
 * @param Value, the hierarchy of the card or how much the card is worth compared to others
 */
  
  

  public Card(String name, String suits, int value) {
    this.suits = suits; 
    
    this.name = name;  // stores the value inside the variable
     
    this.value = value; 
  }



/* @return suit as a string so its readable */

  public String getSuits() {  
    return this.suits;
  }



/* @return  the name of the card also as a string */
  public String getName() { // returns my values
    return this.name; // you can either return name or this.name. As long as you stay consistent it doesn't really matter
  }



  /* @return  value of the card */

  public int getValue() { 
    return this.value;
  }


/* @return  the full name of the card */



@Override
public String toString() { //  creates something like "Ace of Hearts" or "King of Spades"
    return this.name + " of " + this.suits; // all cards no matter what have a "of" in the middle. 
  }
  /* @param obj, something to compare each card with, Not necessary another card */



@Override
public boolean equals(Object obj) { 
  if (obj == null || getClass() != obj.getClass()) { // checks if its null. if it is it just returns false 
    return false; // instead of crashing because of the null it returns false
 
    /* @return true if the 2 cards have the same suit, value and name */
  } 
  //checking memory just in case
  if (this == obj) { // it just checks if the instance is the same as the object being compared
    return true; 
  } 

/* Checking if cards are the same from their 3 things */

  Card card = (Card) obj; // first casting the obj to a card. you cant compare cards if one isnt a card.
  return value == card.value && name.equals(card.name) && suits.equals(card.suits); // checks all 3 fields
} 
  }



