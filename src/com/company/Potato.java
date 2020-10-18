package com.company;

public class Potato extends Food {
    public void consume() {
        System.out.print(this + " eaten");
    }
    private String type;
    private Double calories = null;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double calculateCalories()
    {
        if(type.equals("fried"))
        {
            calories = 192.0;
        }
        else if(type.equals("boiled"))
        {
            calories = 82.0;
        }
        else if(type.equals("french fries"))
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
