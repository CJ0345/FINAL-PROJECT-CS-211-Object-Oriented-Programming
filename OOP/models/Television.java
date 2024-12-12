package models;

import utils.Input;

public class Television extends Appliances {
    public Television(){
        initialize();
    }
    @Override
    public void initialize() {
        this.name = Input.string("Enter Television Brand: ");
        this.quantity = Input.number("Enter Television stocks: ");
        this.rank = 2;  
    }
    @Override
    public void print() {
        System.out.println(String.format("Television: [%s] %s",quantity, name));
    }
}