


public class PenAdapter implements Pen {
    
    GelPen gp = new GelPen();


    public void write(String str){

        gp.mark(str);

    }

}
