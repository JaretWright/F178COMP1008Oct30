package f18comp1008oct30;

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
        
    }
}
