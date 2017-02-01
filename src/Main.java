import javax.naming.ldap.UnsolicitedNotification;
import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int x = 25;

    private static final long ITERATION_NUMBER = 100000L;

    public static void main(String[] args) {

        Random random = new Random();

        try {
            System.out.println(delenie("1", "0"));
        }catch (ArithmeticException e){
            try {
                System.out.println("Delenie na 0");
            }catch (Exception e2){
                System.out.println(e2.toString());
            }
        }catch (NumberFormatException e){
            //e.printStackTrace();
            System.out.println("v stringe ne chislo");
        }catch (Exception e){
            System.out.println("EXEPTION");
        }finally {
            System.out.println("FINALLY!!!!");
        }
    }

    public static int delenie(String a, String b) throws Exception{
        int result = 0;
        int one, two;
            one = Integer.parseInt(a);
            two = Integer.parseInt(b);
            result = one / two;

        return result;
    }

        /*Set<Integer> set = new HashSet<Integer>();
        for (int i = 0;i<20; i++){
            set.add(random.nextInt(20));
        }
        Iterator iterator = set.iterator();
       while (iterator.hasNext()){
           int k = (Integer) iterator.next();
           if (k>10){
               iterator.remove();
           }
       }
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }*/



     /*   Map<String, Cat> set = new HashMap<String, Cat>();
        set.put("arbuz", new Cat("arbuz"));
        set.put("banan", new Cat("banan"));
        set.put("vishnya", new Cat("vishnya"));
        set.put("grusha", new Cat("grusha"));
        set.put("ezhevika", new Cat("ezhevika"));
        set.put("dunya", new Cat("dunya"));
        set.put("zhenshen", new Cat("zhenshen"));
        set.put("iris", new Cat("iris"));
        set.put("kartofel", new Cat("kartofel"));
        set.put("cat", new Cat("cat"));

        Set<String> setName = new HashSet<String>();

        for (Map.Entry<String, Cat> me:set.entrySet()){
            setName.add(me.getValue().getName());
            System.out.println(me.getValue().getName());
        }
*/

        /*HashMap<String,String> set = new HashMap<String, String>();

        set.put("arbuz", "yagoda");
        set.put("banan", "trava");
        set.put("vishnya", "yagoda");
        set.put("grusha", "frukt");
        set.put("dunya", "ovosh");
        set.put("ezhevika", "kust");
        set.put("zhenshen", "koren");
        set.put("zemlyanika", "yagoda");
        set.put("iris", "cvetok");
        set.put("kartofel", "kluben");

        for (Map.Entry<String, String> me:set.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue());
        }*/


       /* Map<String, String> map = new HashMap<String,String>();
        String s = "string";

        for (int i = 0; i<map.size(); i++){

            map.put(s+i, s+i);
        }

        for ( Map.Entry mapp : map.entrySet() ) {
            System.out.println( mapp.getKey() );
        }*/


      /*  List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i<20; i++) {
            list.add(random.nextInt(100));
        }
        Collections.sort(list);
       for (int i = list.size()-1; i>=list.size()-5; i--)
           System.out.println(list.get(i));

        System.out.println();

        for (int i = 1; i < 6; i++)
            System.out.println(list.get(list.size()-i));*/

/*

        List<Tank> tanArrayList = new ArrayList<Tank>();
        List<Tank> tankLinkedList = new LinkedList<Tank>();

        long beginTime = System.currentTimeMillis();
        fillList(tanArrayList);
        System.out.println("ARRAYLIST = " + (System.currentTimeMillis()-beginTime));

        beginTime = System.currentTimeMillis();
        fillList(tankLinkedList);
        System.out.println("LINKEDLIST = " + (System.currentTimeMillis()-beginTime));
*/


    }

    /*private static void fillList(List list){
        for (long i = 0; i < ITERATION_NUMBER; i++){
            list.add(new Tank());
        }
    }*/


