package edu.upc.eetac.dsa;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{

        UserImpl u = new UserImpl(1, "Juan");
        System.out.println(u.getName());

        Class c = Class.forName("eetac.ea.User");
        User u2 = (User)c.newInstance();
        u2.setName("Pere");
        System.out.println(u2.getName());

        /*Class c2 = u.getClass();

        for(Constructor constr: c2.getConstructors()) {
            System.out.println(constr.toGenericString());
        }

        System.out.println("=====");

        for(Field f: c2.getDeclaredField()) {
            System.out.println(f.getName());
        }

        System.out.println("=====");

        for (Method m: c2.getMethods()) {
            System.out.println(m.getName());
        }*/
    }
}