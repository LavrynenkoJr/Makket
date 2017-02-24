/**
 * Created by java-1-04 on 22.02.2017.
 */
public class MyThread1 implements Runnable {
    private static Object locker1 = new Object();

    @Override
    public void run() {
        synchronized (locker1) {
            try {
                locker1.wait(1000);
                System.out.flush();
                System.out.println("Doc = " + Main.room.getCountDoctor() + "Vis = " + Main.room.getCountVisitors());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        run();
    }
}
