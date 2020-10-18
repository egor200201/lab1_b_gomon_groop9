package com.company;
import java.lang.reflect.Constructor;
import java.util.*;
public class Breakfastmain {

    @SuppressWarnings("unchecked")

    public static void main(String[] args)
    {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        boolean cls, srt;
        cls = srt = false;

        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Potato")) {
                breakfast[itemsSoFar] = new Potato(parts[1]);
            }
            itemsSoFar++;
            switch (parts[0]) {
                case "-sort":
                    srt = true;
                    break;
                case "-calories":
                    cls = true;
                    break;
            }
        }
        if (srt==true) {
            Arrays.sort(breakfast, new Comparator() {
                public int compare(Object o1, Object o2)
                {
                    if (o1 == null || String.valueOf((Food)o2).charAt(0) < String.valueOf((Food)o1).charAt(0))
                    {
                        return -1;
                    }

                    if (o2 == null || String.valueOf((Food)o2).charAt(0) > String.valueOf((Food)o1).charAt(0))
                    {
                        return 1;
                    }
                    else return 0;
                }
            });

            System.out.println("отсортированный завтрак :");
            for (Food item : breakfast)
            {
                if (item != null)
                {
                    if (item.calculateCalories()==0.0)
                        continue;
                    item.consume();
                    System.out.println(" " + item.calculateCalories());
                }
            }
        }
        if (!srt)
        {
            System.out.println("breakfast: ");
            for (Food item : breakfast) {
                if (item != null)
                {
                    item.consume();
                    System.out.println(" " + item.calculateCalories());
                }
            }
        }
        if (cls)
        {
            double AllCalories = 0.0;
            for (Food item : breakfast)
            {
                if (item != null)
                    AllCalories += item.calculateCalories();
            }
            System.out.println("общая калорийность завтрака: " + AllCalories);
        }

        System.out.println("всего хорошего!");

    }
}
