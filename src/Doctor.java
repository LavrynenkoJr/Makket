import java.util.Random;
import java.util.TimerTask;

public class Doctor extends Thread {

    private int timeDoctorInRoom = 5000;

    private Room room;

    public Doctor(Room room) {
        this.room = room;
        //System.out.println("Created Doctor");
    }

    @Override
    public void run() {
        if (room.enterDoctor()) {
            try {
                Thread.sleep(timeDoctorInRoom);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            room.exitDoctor();
        }
    }
}
