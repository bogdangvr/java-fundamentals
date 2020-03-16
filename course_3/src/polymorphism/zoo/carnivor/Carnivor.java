package polymorphism.zoo.carnivor;

import polymorphism.zoo.Animal;

/**
 * @author cvoinea
 */
public abstract class Carnivor extends Animal {

    public Carnivor(String nume, int varsta){
        super(nume, varsta);
        this.tipHrana = "carne";
    }

    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu " + this.tipHrana);
    }

    @Override
    public String toString() {
        return super.toString() + " Carnivor{" +
                "tipHrana='" + tipHrana + '\'' +
                '}';
    }
}
