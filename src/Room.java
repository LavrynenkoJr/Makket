import java.util.Observable;

public class Room extends Observable {

    private int id;

    private int countDoctor;
    private int countVisitors;

    private int maxDoctor;
    private int maxVisitor;

    public Room(int id, int maxDoctor, int maxVisitor) {
        this.id = id;
        this.maxDoctor = maxDoctor;
        this.maxVisitor = maxVisitor;
    }

    public synchronized void notifyDisplay() {
        setChanged();
        notifyObservers();
    }

    public synchronized boolean enterVisitor(){

        if (countVisitors < maxVisitor && countDoctor == 0) {
            countVisitors++;
            notifyDisplay();
            return true;
        }
        return false;
    }

    public synchronized int exitVisitor(){

        if (countVisitors != 0) {
            countVisitors--;
            notifyDisplay();
        }
        return countVisitors;
    }

    public synchronized boolean enterDoctor(){

        if (countDoctor < maxDoctor && countVisitors == 0) {
            countDoctor++;
            notifyDisplay();
            return true;
        }
        return false;
    }

    public synchronized int exitDoctor(){

        if (countDoctor != 0) {
            countDoctor--;
            notifyDisplay();
        }
        return countDoctor;
    }

    public int getCountDoctor() {
        return countDoctor;
    }

    public int getCountVisitors() {
        return countVisitors;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String s = "| Room Id = " + id + " Doctors = " + countDoctor + " Visitors = " + countVisitors + " | ";
        return s;
    }
}
