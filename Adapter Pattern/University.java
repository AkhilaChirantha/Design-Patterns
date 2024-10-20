public class University {

    public static void main(String[] args) {


        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I can do it.");
        
    }
}
