package f18comp1008oct30;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class Car extends Transport{
    private String model;
    private int year;

    public Car(String model, int year, String manufacturer) {
        super(manufacturer);
        setModel(model);
        setYear(year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty())
            this.model = model;
        else
            throw new IllegalArgumentException("Model cannot be empty");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1884 && year <= LocalDate.now().getYear()+1)
        this.year = year;
    }

  

    @Override
    public String movesBy() {
        return "rolls on pavement";
    }
    
    @Override
    public String toString()
    {
        return String.format("%d %s %s", year, super.getManufacturer(),
                                    model);
    }

 
    
    
}
