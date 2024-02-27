package app;

import app.model.Fruit;
import app.model.Vegitable;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        String[] friuts = {"apple", "banana", "melon", "watermelon", "kiwi"};
        String[] vegys = {"cucumber", "potato", "egg plants", "cuciny", "beets"};
        Fruit fruitList = new Fruit(friuts);
        Vegitable vegyList = new Vegitable(vegys);
        Thread threadFruit = new Thread(fruitList);
        Thread threadVegy = new Thread(vegyList);
        threadVegy.start();
        threadVegy.join();
        threadFruit.start();




      //  System.out.printf(fruitList.toString());


    }
}