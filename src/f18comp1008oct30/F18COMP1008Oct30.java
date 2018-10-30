package f18comp1008oct30;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class F18COMP1008Oct30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog frank = new Dog("Frank");
        Cat bailey = new Cat("Bailey");
        
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(frank);
        pets.add(bailey);
        
        System.out.println(pets);
        
        for (Pet pet:pets)
        {
            System.out.printf("%s says %s%n", pet.toString(),pet.toSpeak());
        }
        
    }
    
}
