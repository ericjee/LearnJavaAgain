package animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by eric on 4/7/16.
 */
public class DogDemo {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tommy", 1));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        Collections.sort(list);
        for (Dog dog: list
             ) {
            System.out.println(dog.getName() + ", ");
        }

        Collections.sort(list, new Dog());
        System.out.println(" ");
        for (Dog dog: list) {
            System.out.println(dog.getName() + " :" + dog.getAge() + ", ");
        }
    }
}
