import javax.naming.ldap.UnsolicitedNotification;
import javax.swing.text.html.HTMLDocument;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();

        Class myObj1 = cat.getClass();
        Class myObj2 = Bicycle.class;
        Class myObj3 = null;
        Class myObj4 = Object.class;

        try {
            myObj3 = Class.forName("Tank");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        printNameClass(myObj1);
        /*printNameClass(myObj2);
        printNameClass(myObj3);
        printNameClass(myObj4);*/

    }

    public static void printNameClass(Class classs){

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

    }
}




