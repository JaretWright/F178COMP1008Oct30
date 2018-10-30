package f18comp1008oct30;

/**
 *
 * @author jwright
 */
public class Boat extends Transport{

    public Boat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public String movesBy() {
        return "propels through water";
    }
    
}
