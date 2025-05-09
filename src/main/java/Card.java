
final class Card { 
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

  if (obj == null || getClass() != obj.getClass()) { // checks if its null. if it is it just returns false to me
    return false; // returns false if the check is true,
  } 

  Card card = (Card) obj;
  return value == card.value && name.equals(card.name) && types.equals(card.types);
} 
  @Override
  public int hashCode() { //https://kiranukamath.medium.com/understanding-hashcode-and-equals-in-java-9041b1c418ef
    int result = name.hashCode();
    result = 7 * result + types.hashCode();  // you can use any PRIME NUMBER. I just like the number 7. its the day my dog was born
    result = 7 * result + value;
    return result;
  }
}


