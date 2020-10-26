package com.company;
import java.util.Arrays;

public class Potato  extends Food implements Nutritous {
    public void consume() {
        System.out.print(this + " eaten");
    }
    public String type;
    private Double calories = null;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double calculateCalories()
    {
        if(type.equals("Fried"))
        {
            calories = 192.0;
        }
        else if(type.equals("Boiled"))
        {
            calories = 82.0;
        }
        else if(type.equals("French fries"))
        {
            calories = 400.0;
        }
        return calories;
    }

    public Potato(String type) {
        super("Potato");
        this.type = type;
    }
    public String toString() {
        return super.toString()+ " " + type.toUpperCase() ;
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Potato)) return false;
            return type.equals(((Potato)arg0).type);
        } else
            return false;
    }
}