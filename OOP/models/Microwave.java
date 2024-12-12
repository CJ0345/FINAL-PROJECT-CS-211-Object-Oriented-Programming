package models;
import utils.Input;

public class Microwave extends Appliances {
    public Microwave(){
        initialize();
    }

    @Override
    public void initialize() {
        this.name = Input.string("Enter Microwave Brand: ");
        this.quantity = Input.number("Enter Microwave stocks: ");
        this.rank = 1;
    }
    
    @Override
    public void print() {
        System.out.println(String.format("Microwave: [%s] %s",quantity, name));
    }
}