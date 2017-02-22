/**
 * Created by java-1-04 on 22.02.2017.
 */
public class MyThread1 implements Runnable {

    int begin;
    int end;
    int[] arr;

    private int max = 0;

    public int getMax() {
        return max;
    }

    public MyThread1(int begin, int end, int[] arr) {
        this.begin = begin;
        this.end = end;
        this.arr = arr;
    }


    public void run(){

        for (int i = begin; i < end; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);


        synchronized (Main.locker) {
            Main.locker.notify();
        }


    }

}
