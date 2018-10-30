package f18comp1008oct30;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class TransportTest {
    public static void main(String[] args)
    {
        Boat boat = new Boat("Cobalt");
        System.out.printf("%s moves by %s%n", boat, boat.movesBy());
        
        Car car = new Car("Mustang", 2018, "Ford");
        System.out.printf("%s moves by %s%n", car, car.movesBy());
        
        ArrayList<Colours> stuff = new ArrayList<>();
        stuff.add(boat);
        stuff.add(car);
        
        Dog frank = new Dog("Frank");
        Cat bailey = new Cat("Bailey");
        stuff.add(frank);
        stuff.add(bailey);
        
        for (Colours colour:stuff)
        {
            System.out.println(colour.toString() + " is " + colour.getColour());
        }
        
    }
}
