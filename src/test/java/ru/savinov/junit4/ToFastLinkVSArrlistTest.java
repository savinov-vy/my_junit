package ru.savinov.junit4;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToFastLinkVSArrlistTest {

    List<String> arrList;
    List<String> linkList;

    @Before
    public void setUp() {
        List<String> collect = IntStream.rangeClosed(0, 8000_000)
                .boxed().map(i -> i + "")
                .collect(Collectors.toList());
        arrList = new ArrayList<>(collect);
        linkList = new LinkedList<>(collect);
    }

    @Test
    public void testRemove() {
        ToFastLinkVSArrlist.remove(arrList, "4000000");
        ToFastLinkVSArrlist.remove(linkList, "4000000");
    }

    @Test(timeout = 1000)
    public void testRemove_arrList() {
        ToFastLinkVSArrlist.remove(arrList, "4000000");
    }

    @Test(timeout = 100)
    public void testRemove_linkList() {
        ToFastLinkVSArrlist.remove(linkList, "4000000");
    }
}
