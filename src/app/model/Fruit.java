package app.model;



public class Fruit implements Runnable{

    String[] farr;

    public Fruit(String[] farr) {
        this.farr = farr;
    }

    @Override
    public void run() {
        System.out.println("The list of fruits: \n");
        for (String f : farr){
            System.out.println(f);
        }
        System.out.println("\n");
    }
}
