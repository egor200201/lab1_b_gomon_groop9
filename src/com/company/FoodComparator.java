package com.company;

import java.util.Comparator;
public class FoodComparator implements Comparator<Food> {
    public int compare(Food arg0, Food arg1) {
        // если 1-ый объект = null, то он всегда "больше", т.е. перемещается
        // в конец массива
        if (arg0==null) return 1;
        // если 2-ой объект = null, а 1-ый - нет (не сработала предыдущая
        // строчка), то 1-ый всегда меньше, т.е. перемешается в начало массива
        if (arg1==null) return -1;
        // если оба объекта не null, то результат сравнения определяется
        // сравнением их name
        if (arg0 instanceof Apple && arg1 instanceof Apple)  {

            return  ( (Apple) arg0).getSize().compareTo( ( (Apple) arg1).getSize());

        }
        if (arg0 instanceof Potato && arg1 instanceof Potato)  {

            return  ( (Potato) arg0).getType().compareTo( ( (Potato) arg1).getType());

        }
        return arg0.getName().compareTo(arg1.getName());
    }



}
