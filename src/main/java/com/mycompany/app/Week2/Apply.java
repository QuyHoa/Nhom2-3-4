package com.mycompany.app.Week2;

import static net.mindview.util.Print.*;
import java.util.*;

interface Processor {
    String name();
    Object process(Object input);
}

class StringSwapper implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public String process(Object input) {
        String str = (String) input;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        return new String(chars);
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new StringSwapper(), s);
    }
}