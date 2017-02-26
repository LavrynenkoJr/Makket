
public class Room {

    private static Object locker = new Object();

    private int countDoctor = 0;
    private int countVisitors = 0;

    private int maxDoctor = 1;
    private int maxVisitor = 4;

    public synchronized boolean enterVisitor(){
        synchronized (Monitoring.locker1) {
            if (countVisitors < maxVisitor && countDoctor == 0) {
                countVisitors++;

                Monitoring.locker1.notify();

                return true;
            }
        }
        return false;
    }

    public int exitVisitor(){
        synchronized (Monitoring.locker1) {
            if (countVisitors != 0) {
                countVisitors--;
            }
            Monitoring.locker1.notify();
        }
        return countVisitors;
    }

    public synchronized boolean enterDoctor(){
        synchronized (Monitoring.locker1) {
            if (countDoctor < maxDoctor && countVisitors == 0) {
                countDoctor++;

                Monitoring.locker1.notify();

                return true;
            }
        }
        return false;
    }

    public int exitDoctor(){
        synchronized (Monitoring.locker1) {
            if (countDoctor != 0) {
                countDoctor--;
                Monitoring.locker1.notify();
            }
        }
        return countDoctor;
    }

    public int getCountDoctor() {
        return countDoctor;
    }

    public int getCountVisitors() {
        return countVisitors;
    }

}
