package models;

import utils.Input;

public class Refrigerator extends Appliances {
    public Refrigerator(){
        initialize();
    }
    @Override
    public void initialize() {
        this.name = Input.string("Enter Refrigerator Brand: ");
        this.quantity = Input.number("Enter Refrigerator stocks: ");
        this.rank = 4;
    }
    
    @Override
    public void print() {
        System.out.println(String.format("Refrigerator: [%s] %s",quantity, name));
    }
}