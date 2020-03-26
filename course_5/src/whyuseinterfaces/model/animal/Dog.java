package whyuseinterfaces.model.animal;

import whyuseinterfaces.Washable;

/**
 * @author cvoinea
 */
public class Dog extends Animal implements Washable {

    @Override
    public void wash() {
        System.out.println("washing a dog");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }
}
