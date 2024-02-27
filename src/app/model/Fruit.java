package app.model;



public class Fruit implements Runnable{

    String[] farr;

    public Fruit(String[] farr) {
        this.farr = farr;
    }

    @Override
    public void run() {
        for (String f : farr){
            System.out.println(f);
        }

    }
}
