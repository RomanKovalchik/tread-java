package app.model;

public class Vegitable implements Runnable{


    String [] varr;

    public Vegitable(String[] varr) {
        this.varr = varr;
    }

    @Override
    public void run() {
        for (String v : varr){
            System.out.println(v);
        }
    }
}
