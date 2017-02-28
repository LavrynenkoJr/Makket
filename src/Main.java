import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int PROBABILITY_DOCTOR = 2;
    private static final int PROBABILITY_VISITOR = 5;

    private static Random random;

    public static void main(String[] args) throws InterruptedException {

        // создаем комнаты с указанием № комнаты и вместительностью докторов и посетителей
        Room room1 = new Room( 1,1, 4);
        Room room2 = new Room(2,3, 5);
        Room room3 = new Room (3,1, 6);
        Room room4 = new Room (4,5, 6);
        Room room5 = new Room (5,1, 6);
        List<Room> roomList = new ArrayList<Room>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);

        Monitoring monitoring = new Monitoring(roomList);

        random = new Random();

        for (int i = 0; i < roomList.size(); i++) {
            randomiser(roomList.get(i));
        }
    }

    public static void randomiser(Room room){

        final Room innerRoom = room;

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {


                while (true){

                    if (random.nextInt() < PROBABILITY_VISITOR){
                        Thread visitor = new Visitor(innerRoom);
                        visitor.start();
                    }
                    if (random.nextInt() < PROBABILITY_DOCTOR){
                        Thread doctor = new Doctor(innerRoom);
                        doctor.start();
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

    }
}
