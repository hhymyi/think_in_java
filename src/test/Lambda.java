package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }
//        old(list);
        new1(list);
    }

    private static void new1(List<String> list) {
        list.forEach((String a) -> {
            System.out.println(a);
        });
    }

    private static void old(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
