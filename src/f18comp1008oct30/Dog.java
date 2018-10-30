package f18comp1008oct30;

/**
 *
 * @author jwright
 */
public class Dog extends Pet{
    
    public Dog(String petName) {
        super(petName);
    }

    @Override
    public String toSpeak() {
        return "woof woof";
    }
    
    @Override
    public String toString()
    {
        return String.format("%s is a dog", super.getPetName());
    }
   
      @Override
    public String getColour() {
        return "yellow";
    }
}
