import java.util.Random;

public class Main {

    static int timeInMilisecond = 1000;

    static int verDoctor = 4;
    static int posDoctor = 5;

    static Room room;


    public static void main(String[] args) throws InterruptedException {

        final Random random = new Random();
        room = new Room();

        Thread monitoring = new Monitoring(room);
        monitoring.start();

        Thread possibilityVisitor = new Thread(new Runnable() {
            @Override
            public void run() {
                if (random.nextBoolean()){
                    Thread visitor = new Visitor(room);
                    visitor.start();
                }
                try {
                    Thread.sleep(timeInMilisecond);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                run();
            }
        });
        possibilityVisitor.start();

        Thread possibilityDoctor = new Thread(new Runnable() {
            @Override
            public void run() {
                if ( verDoctor == random.nextInt(posDoctor) ){
                    Thread doctor = new Doctor(room);
                    doctor.start();
                }
                try {
                    Thread.sleep(timeInMilisecond);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                run();
            }
        });
        possibilityDoctor.start();


    }
}
