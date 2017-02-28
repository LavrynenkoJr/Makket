import java.util.Random;
import java.util.TimerTask;

public class Visitor extends Thread{

    private int timeVisitorInRoom = 3000;

    private Room room;

    public Visitor(Room room) {
        this.room = room;
    }

    @Override
    public void run() {
        if (room.enterVisitor()) {
            try {
                Thread.sleep(timeVisitorInRoom);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            room.exitVisitor();
        }
    }
}
