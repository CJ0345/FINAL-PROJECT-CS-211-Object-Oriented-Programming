import java.util.ArrayList;
import java.util.Collections;

import models.*;
import utils.*;

public class Shop{
    public void open(){
        println("Welcome to Imperial Store.");
        while(true){
            println("\n\nWhat do you want to do?");
            println("1. View Appliances.");
            println("2. Add Appliances.");
            println("3. Order Appliances.");
            println("4. View Ordered Appliances.");
            println("5. Exit");
            getChoice();
        }
    }

    private void getChoice(){
       while(true){
           String input;
           try{
                input = Input.string("-> ");
                int i = Integer.parseInt(input);
                if(i<1 || i>5){

                    throw new ChoiceException();

                }

                performAction(i);
                break;
            }catch(NumberFormatException e){
                println("Input must be a number");
            }catch(ChoiceException c){
                println("Input must be any of the ff: (1,2,3,4)");
            }
        }
    }

    private void performAction(int choice){
       switch(choice){
            case VIEW:
                view_Appliances("");
                break;
            case ADD:
                addAppliances();
                break;
            case ORDER:
                orderAppliances();
            break;
            case VIEW_ORDERED:
                viewOrdered();
            break;
            case EXIT:
            System.exit(0);
            break;
        }
    }
     private void view_Appliances(String extra){
        if(appliances.isEmpty()){
            println("Our shop is empty.");
            return;
        }
        Collections.sort(appliances);
        println("\n========== Menu ==========="+extra);
        for(int i = 0; i < appliances.size(); i++){
            print((i+1)+".) ");
            appliances.get(i).print();
        }
        println("========== ==== ===========");
    }
    private void addAppliances(){
        switch(selectAppliances()){
            case AIRCON:
                appliances.add(new Aircon());
            break;
            case MICROWAVE:
                appliances.add(new Microwave());
            break;
            case REFRIGERATOR:
                appliances.add(new Refrigerator());
            break;
            case TELEVISION:
                appliances.add(new Television());
        }
        println("Successfully added");
    }

    private int selectAppliances(){
        println("What would you like to add?");
        println("1. Aircon.");
        println("2. Microwave.");
        println("3. Refrigerator.");
        println("4. Television.");
        int choice = 0;
        while(true){
            String input;
            try{
                input = Input.string("-> ");
                choice = Integer.parseInt(input);
                if(choice<1 || choice>4){
                    throw new ChoiceException();
                }
                break;
            }catch(ChoiceException c){
                println("Input must be any of the ff: (1,2,3,4)");
            }
        }
        return choice;
    }
    private void orderAppliances(){
        if(appliances.isEmpty()){
            println("Nothing to order.");
            return;
        }
        view_Appliances("\nSelect Appliance\n");
        int index = Input.number("index: ")-1;
        if(index >= appliances.size() || index < 0){
            println("Invalid input");
            return;
        }
        Appliances b = appliances.get(index);
        int amount = Input.number("Enter amount to order: ");
        if(amount == 0){
            println("Can't order zero appliances.");
            return;
        }
        if(amount > b.quantity){
            println("Cant more than what we have.");
            return;
        }
        b.quantity -= amount;
        appliances.set(index, b);
        print("Successfully ordered "+amount+" appliances");
        order.add(new Order(b.name, amount));
    }
    public void viewOrdered(){
        if(order.isEmpty()){
            println("You have not ordered anything yet.");
            return;
        }
        println("\n========= History ==========");
        for(int i = 0; i < order.size(); i++){
            print((i+1)+".) ");
            order.get(i).print();
        }
        println("============================");
    }
    public void exit(){
        System.exit(0);
    }

    private void print(String message){
        System.out.print(message);
    }
    private void println(String message){
        System.out.println(message);
    }
    private static final int VIEW = 1;
    private static final int ADD = 2;
    private static final int ORDER = 3;
    private static final int VIEW_ORDERED = 4;
    private static final int EXIT = 5;

    private static final int AIRCON = 1;
    private static final int MICROWAVE = 2;
    private static final int REFRIGERATOR = 3;
    private static final int TELEVISION = 4;

    ArrayList<Order> order = new ArrayList<>();
    ArrayList<Appliances> appliances = new ArrayList<>();
}