package app;

import app.model.Fruit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String[] friuts = {"apple", "banana", "melon", "watermelon", "kiwi"};
        String[] vegys = {"cucumber", "potato", "egg plants", "cuciny", "beets"};
        Fruit fruitList = new Fruit(friuts);
        Thread threadFruit = new Thread(fruitList);
        threadFruit.start();

        System.out.printf(fruitList.toString());


    }
}