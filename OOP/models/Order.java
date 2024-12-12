package models;

public class Order {
    public Order(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    private String name;
    private int amount;

    public void print(){
        System.out.println(name+" "+amount);
    }
}