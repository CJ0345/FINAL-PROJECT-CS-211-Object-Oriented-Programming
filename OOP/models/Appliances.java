package models;

public abstract class Appliances implements Comparable<Appliances>{
    protected String size;
    protected int rank;
    public String name;
    public int quantity;

    public abstract void initialize();
    public abstract void print();

    @Override
    public int compareTo(Appliances b) {
        if(this.rank > b.rank){
            return 1;
        }else if(this.rank < b.rank){
            return -1;
        }
        return 0;
    }
}