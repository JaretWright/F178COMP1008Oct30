package f18comp1008oct30;

/**
 *
 * @author jwright
 */
public class Cat extends Pet{

    public Cat(String petName) {
        super(petName);
    }

    @Override
    public String toSpeak() {
        return "meow meow";
    }
    
    @Override
    public String toString()
    {
        return String.format("%s is a cat", super.getPetName());
    }

    @Override
    public String getColour() {
        return "white";
    }
}
