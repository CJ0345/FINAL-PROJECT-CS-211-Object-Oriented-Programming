package models;

import utils.Input;

public class Aircon extends Appliances{
    
    public Aircon(){
        initialize();
    }
    
    @Override
    public void initialize() {
        this.name = Input.string("Enter Aircon Brand: ");
        this.quantity = Input.number("Enter Aircon stocks: ");
        this.rank = 3;
    }

    @Override
    public void print() {
        System.out.println(String.format("Aircon: [%s] %s",quantity, name));
    }
    
}