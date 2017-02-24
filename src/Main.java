import java.util.Random;
import java.util.Timer;

public class Main {

    public static Object locker = new Object();
    public static Room room = new Room();

    public static void main(String[] args) throws InterruptedException {

        final Random random = new Random();


        Timer timer = new Timer();
        timer.schedule(new Visitor(), 0, 1000);

        Timer timer2 = new Timer();
        timer2.schedule(new Doctor(), 0, 1000);

        Thread thread = new Thread(new MyThread1());
        thread.start();
    }


     /*   Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    doSmth(i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (locker){
                        System.out.println("T2 notify");
                        locker.notify();
                    }

                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.setName(" T1 Thread");
        t2.setName(" T2 Thread");

        t1.start();
        t2.start();
    }

    private static Object locker = new Object();

    public static void doSmth(int info) {
        synchronized (locker) {
            String name = Thread.currentThread().getName();
            System.out.println("doSmth begin " + name + info);

            try {
                locker.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("doSmth end " + name + info);
        }
    }*/

       /* A a = new A();
        B b = new B();

        Integer i = new Integer(1);
        String s = "string";

        Holder<Integer> holder = new Holder<Integer>(i);
        holder.print();

        Holder<String> holder1 = new Holder<String>(s);
        holder1.print();



        Inspector inspector = new Inspector();
        String s1 = "Hello";
        //inspector.inspect(s1);
        //inspector.<String>inspect(s1);

        Integer integer = new Integer(15);
        //inspector.inspect(holder);


        List<Integer> integers = new ArrayList<Integer>();
        List<Number> numbers = new ArrayList<Number>();

        inspector.inspect(numbers);
        inspector.inspect(integers);*/

    //}

  /*  static class Inspector{

        public void inspect(List<? extends Number> t){

            System.out.println("Inspect = " + t.size());
        }

    }

    static class Holder<T>{
        private T[] t;
        private int first;
        private int second;

        public Holder(T[] t, int first, int second) {
            this.t = t;
            this.first= first;
            this.second = second;
        }

        public T[] chenhge(T[] t) {

            T obj;
            obj =

        }

        public void print(){
            System.out.println(t.getClass().getSimpleName());
        }

    }

    static class A{

        public A() {
        }

        public void x(){
            System.out.println("A.x");
        }

    }

    static class B extends A{

        public void x(){
            System.out.println("B.x");
        }

    }*/



        /*Cat cat = new Cat();

        Class myObj1 = cat.getClass();
        Class myObj2 = Bicycle.class;
        Class myObj3 = null;
        Class myObj4 = Object.class;*/


       /* Field f = myObj1.getDeclaredField("name");
        f.setAccessible(true);
        f.setInt(cat, 3);

        System.out.println(cat.getName());
*/




       /* try {
            myObj3 = Class.forName("Tank");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        */


        //printNameClass(myObj1);
        /*printNameClass(myObj2);
        printNameClass(myObj3);
        printNameClass(myObj4);*/

    /*public static void printNameClass(Class classs){

        try {
            Cat cat = (Cat) classs.newInstance();
            cat.setName("");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Annotation[] annotations = classs.getAnnotations();
        System.out.println("Annotations ");
        for (Annotation c: annotations){
            System.out.println(c.toString());
        }

        Field[] fields = classs.getFields();
        System.out.println("Fields ");
        for (Field c: fields){
            System.out.println(c.toString());
        }

        Method[] methods = classs.getDeclaredMethods();
        System.out.println("Methods ");
        for (Method c: methods){
            System.out.println(c.toString());
        }

        Constructor[] constructors = classs.getConstructors();
        System.out.println("Constructors ");
        for (Constructor c: constructors){
            System.out.println(c.toString());
        }

        Class[] interfaces = classs.getInterfaces();
        for (Class c: interfaces){
            System.out.println(c.getSimpleName());
        }

        System.out.println(classs.getSuperclass());

        int mods = classs.getModifiers();
        System.out.println(Modifier.toString(mods));

        System.out.println("name = " + classs.getName());

    }*/
}




