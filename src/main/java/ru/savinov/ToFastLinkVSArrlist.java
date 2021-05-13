package ru.savinov;

import java.util.List;

public class ToFastLinkVSArrlist {

    public static void remove(List<String> list, String elem) {
        System.out.println(list.getClass().getSimpleName() + " :\t");
        long start = System.nanoTime();
        list.remove(elem);
        long stop = System.nanoTime();
        System.out.println("removed " + (stop - start) + " nanos");
    }
}
