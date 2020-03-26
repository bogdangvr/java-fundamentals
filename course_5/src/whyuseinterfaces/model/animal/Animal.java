package whyuseinterfaces.model.animal;

/**
 * @author cvoinea
 * <p>
 * this class doesn't implement washable because we don't want all subclasses to be forced to describe
 * a behavior they don't necessarily have
 */
public abstract class Animal {

    private String species;
    private int age;

    public abstract void eat();
}
