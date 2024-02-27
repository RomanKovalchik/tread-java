package app.model;

public class Vegitable implements Runnable{


    String [] varr;

    public Vegitable(String[] varr) {
        this.varr = varr;
    }

    @Override
    public void run() {
        System.out.println("The list of vegitables: \n");
        for (String v : varr){
            System.out.println(v);
        }
        System.out.println("\n");
    }
}
