import java.io.Console;
import java.io.IOException;

public class Monitoring extends Thread {
    public static final Object locker1 = new Object();
    private Room room;

    public Monitoring(Room room) {
        this.room = room;
    }

    @Override
    public void run() {
        synchronized (locker1) {
            try {

                String s = "Doctor = " + room.getCountDoctor() + " Visitors = " + room.getCountVisitors();
                System.out.print("\r" + s);
                System.out.flush();

                locker1.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        run();
    }
}
