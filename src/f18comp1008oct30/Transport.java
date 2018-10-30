package f18comp1008oct30;

/**
 *
 * @author jwright
 */
public abstract class Transport implements Colours{
    private String manufacturer;

    public Transport(String manufacturer) {
        setManufacturer(manufacturer);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer.isEmpty())
            throw new IllegalArgumentException("Manufacturer cannot be empty");
        else
            this.manufacturer = manufacturer;
    }
    
    public abstract String movesBy();
}
