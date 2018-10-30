package f18comp1008oct30;

/**
 *
 * @author jwright
 */
public abstract class Pet implements Colours{
    private String petName;

    public Pet(String petName) {
        setPetName(petName);
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        if (petName.matches("[A-Z][a-z]*"))
            this.petName = petName;
        else
            throw new IllegalArgumentException("Pet name must start with a capital letter");
    }

    public abstract String toSpeak();
}
