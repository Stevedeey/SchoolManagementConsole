package model;

import java.util.ArrayList;
import java.util.Random;

public class Class {


    private static ArrayList<String> classes ;

    public Class() {
        classes = null;
    }

    public static String returnClass(){
        classes = new ArrayList<>();
        classes.add("JSS ONE");
        classes.add("JSS TWO");
        classes.add("JSS THREE");

        Random random = new Random();
        int randInt = Math.abs(random.nextInt()) % classes.size();
        return classes.get(randInt);
    }
}
