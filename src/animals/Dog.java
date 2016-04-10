package animals;

import java.util.Comparator;

/**
 * Created by eric on 4/7/16.
 */
public class Dog implements Comparable<Dog>, Comparator<Dog> {
    private String name;
    private int age;

    Dog(){}

    Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Dog o) {
        return (this.name).compareTo(o.name);
    }

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.age - o2.age;
    }
}
