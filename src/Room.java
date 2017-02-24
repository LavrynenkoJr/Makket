/**
 * Created by java-1-04 on 24.02.2017.
 */
public class Room {

    private static Object locker = new Object();

    private int countDoctor = 0;
    private int countVisitors = 0;

    public synchronized int enterVisitor(){

        return countVisitors++;
    }

    public int exitVisitor(){

        return countVisitors--;
    }

    public synchronized int enterDoctor(){

        return countDoctor++;
    }

    public int exitDoctor(){

        return countDoctor--;
    }

    public int getCountDoctor() {
        return countDoctor;
    }

    public void setCountDoctor(int countDoctor) {
        this.countDoctor = countDoctor;
    }

    public int getCountVisitors() {
        return countVisitors;
    }

    public void setCountVisitors(int countVisitors) {
        this.countVisitors = countVisitors;
    }
}
